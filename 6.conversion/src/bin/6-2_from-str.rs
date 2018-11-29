use std::num::ParseIntError;
use std::str::FromStr;

#[derive(Debug, PartialEq)]
struct Point {
    x: i32,
    y: i32,
}

#[derive(Debug, PartialEq)]
enum Commands {
    Add,
    List,
}

impl FromStr for Point {
    type Err = ParseIntError;

    fn from_str(s: &str) -> Result<Self, Self::Err> {
        let coords: Vec<&str> = s.trim_matches(|p| p == '(' || p == ')')
            .split(",")
            .collect();

        let x_fromstr = coords[0].parse::<i32>()?;
        let y_fromstr = coords[1].parse::<i32>()?;

        Ok(Point {
            x: x_fromstr,
            y: y_fromstr,
        })
    }
}
#[derive(Debug, PartialEq)]
enum CommandsErr {
    InvalidArgument, // An invalid argument was provided
    NoSuchVariant,   // Error given when shit don't exist
}
impl FromStr for Commands {
    type Err = CommandsErr;

    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "add" => Ok(Commands::Add),
            "list" => Ok(Commands::List),
            _ => Err(CommandsErr::NoSuchVariant),
        }
    }
}

trait Foo {
    type Ok;
    type Err;
    fn bar(&self) -> Result<Self::Ok, Self::Err>;
}

struct Poo;
impl Foo for Poo {
    type Ok = String;
    type Err = &'static str;
    fn bar(&self) -> Result<Self::Ok, Self::Err> {
        let rand_int = 0;
        match rand_int {
            0 => Ok(String::from("sucess")),
            _ => Err("error"),
        }
    }
}

fn main() {
    let p = Point::from_str("(1,2)").unwrap();
    assert_eq!(p, Point { x: 1, y: 2 });
    println!("{:?}", p);

    let op = Commands::from_str("add").unwrap();
    println!("{:?}", op);

    let p = Poo.bar().unwrap();
    println!("poo is {}", p );
}
