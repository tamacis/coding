#![feature(plugin)]
#![plugin(phf_macros)]

extern crate phf;

extern crate strum;
#[macro_use]
extern crate strum_macros;
#[macro_use]
extern crate lazy_static;

use std::io;
use std::io::BufRead;

use std::str::FromStr;
use strum::IntoEnumIterator;

#[derive(Eq, PartialEq, Debug, EnumString, EnumIter, ToString)]
enum Operations {
    add {shorttc},
    list,
    quit,
}
lazy_static! {
    static ref OPERATIONS_CMDS: String = {
        Operations::iter()
            .map(|c| format!(" {}", c.to_string()))
            .collect::<String>()
    };
}

fn main() {
    println!("Department management");
    println!("Commands: {}", *OPERATIONS_CMDS);

    // Loop until false
    while { repl() } {}
}


fn repl() -> bool {
    // Continuation
    let mut cont: bool = true;

    // print the   
    print!("=> " );
    let stdin = io::stdin();
    let line = stdin.lock().lines().next().unwrap().unwrap();
    // println!("{}", line);

    let opt = Operations::from_str(&line);
    // println!("{:?}", opt );
    match opt {
        Ok(v) => {
            match v {
                Operations::add => add_person(),
                Operations::list => list_person(),
                Operations::quit => cont = false,
            }
        }
        Err(_) => {
            println!("Invalid input!!");
            println!("Availble commands are: {}", *OPERATIONS_CMDS);
        }
    };
    cont
}

fn add_person() {
    let mut name = String::new();
    let mut dept = String::new();

    println!("Enter name : ");
    io::stdin()
        .read_line(&mut name)
        .expect("Failed to read line");
    println!("Enter department: ");
    io::stdin()
        .read_line(&mut dept)
        .expect("Failed to read line");
}

fn list_person() {}
