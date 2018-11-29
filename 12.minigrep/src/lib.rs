#![feature(universal_impl_trait)]

use std::env;
use std::error::Error;
use std::fs::File;
use std::io::Read;
use std::iter::FromIterator;

pub fn run(config: Config) -> Result<(), Box<Error>> {
    let mut f = File::open(config.filename).expect("file not found");

    let mut contents = String::new();
    f.read_to_string(&mut contents)?;

    let results = if config.case_sensitive {
        search(&config.query, &contents)
    } else {
        search_case_insensitive(&config.query, &contents)
    };

    for line in results {
        println!("{}", line);
    }
    Ok(())
}

#[derive(Debug, PartialEq)]
pub struct Config {
    pub query: String,
    pub filename: String,
    pub case_sensitive: bool,
}
impl Config {
    pub fn new<S, T>(args: T) -> Result<Config, &'static str>
    where
        S: AsRef<str>,
        T: IntoIterator<Item = S>,
    {
        let args = Vec::from_iter(args);

        if args.len() < 3 {
            return Err("not enough arguments");
        };
        let query;
        let filename;
        let case_sensitive;
        // We parse for -i for case insensitive match
        // The command line option overrides the env variable
        let (q, f): (usize, usize) = if args[1].as_ref() == "-i" {
            case_sensitive = false;
            (2, 3)
        } else {
            case_sensitive = env::var_os("CASE_INSENSITIVE").is_none();
            (1, 2)
        };

        query = args[q].as_ref().to_string();

        filename = args[f].as_ref().to_string();

        Ok(Config {
            query,
            filename,
            case_sensitive,
        })
    }
}

pub fn search<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    contents
        .lines()
        .filter(|line| line.contains(query))
        .collect()
}

pub fn search_case_insensitive<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    let query = query.to_lowercase();
    let mut results = Vec::new();

    for line in contents.lines() {
        if line.to_lowercase().contains(&query) {
            results.push(line);
        }
    }

    results
}

/** TODO: Implement env variables mocking! */
enum EnvQuery {
    Actual,
    Mocked,
}

pub trait EnviromentVarQuery {
    fn get(&self, var: &str, val: &str) -> Result<String, std::env::VarError>;
}

fn get_env_var(var: &str) -> Result<String, std::env::VarError> {
    env::var(var) // Return from enviroment
}

fn get_mocked_env_var(s: &str, v: &str) {}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    #[should_panic]
    fn it_panics_on_no_args() {
        let args = vec![""];
        Config::new(args).unwrap();
    }

    #[test]
    fn it_parses_insensitive_cmdline_arg() {
        let args = vec!["test", "-i", "needle", "haystack.txt"];
        assert_eq!(
            Config {
                query: "needle".to_string(),
                filename: "haystack.txt".to_string(),
                case_sensitive: false
            },
            Config::new(args).expect("Something very wrong in parsing logic!!\n")
        );
    }

    #[test]
    fn it_parses_env_variable() {}

    #[test]
    fn it_does_case_sensitive() {
        let query = "duct";
        let contents = "\
Rust:
safe, fast, productive.
Pick three.
Duct tape.";

        assert_eq!(vec!["safe, fast, productive."], search(query, contents));
    }

    #[test]
    fn it_does_case_insensitive() {
        let query = "rUsT";
        let contents = "\
Rust:
safe, fast, productive.
Pick three.
Trust me.";

        assert_eq!(
            vec!["Rust:", "Trust me."],
            search_case_insensitive(query, contents)
        );
    }
}
