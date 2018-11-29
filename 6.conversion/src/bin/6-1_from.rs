use std::convert::From;

#[derive(Debug)]
struct Number {
    value: i32,
}

#[derive(Debug)]
enum Commands {
    Add,
    List,
    Error
}

impl From<i32> for Number {
    fn from(item: i32) -> Self {
        Number { value: item }
    }
}

impl From<String> for Commands {
    fn from(item: String) -> Self {
        match item.as_ref()  {
            "add" => Commands::Add,
            "list" => Commands::List,
            _ => Commands::Error,
        }
    }
}

fn main() {
    let num = Number::from(30);
    println!("My number is {:?}", num);

    let s = String::from("add");
    let op = Commands::from(s);
    println!("The operation was {:?}", op );
}
