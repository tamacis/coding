#![feature(universal_impl_trait)]

use std::env;

#[derive(Debug, PartialEq)]
pub struct Config {
    pub query:          String,
    pub filename:       String,
    pub case_sensitive: bool,
}

impl Config {
    pub fn new<U: AsRef<str>>(args: impl AsRef<[U]>) -> Result<Config, &'static str> {
        let args = args.as_ref();

        if args.len() < 3 {
            return Err("not enough arguments");
        };

        let case_sensitive;
        let (q, f): (usize, usize) = if args[1].as_ref() == "-i" {
            case_sensitive = false;
            (2, 3)
        } else {
            // The command line option overrides the env variable
            case_sensitive = env::var_os("CASE_INSENSITIVE").is_none();
            (1, 2)
        };

        let query    = args[q].as_ref().to_owned();
        let filename = args[f].as_ref().to_owned();
        Ok(Config {
            query,
            filename,
            case_sensitive,
        })
    }
}

fn main() {
    let _config = Config::new(env::args().collect::<Vec<_>>());
}