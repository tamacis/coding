use std::convert::From;

#[derive(Debug)]
struct Number {
    value: i32,
}

impl From<i32> for Number {
    fn from(item: i32) -> Self {
        Number { value: item }
    }
}

fn main() {
    let int = 5;
    // Try removing the type declaration
    let num: Number = int.into();
    // Have to use .to_string() here since String doesnt implement into
    let s: String = int.to_string();
    println!("My number is {:?}", num);
    println!("i32 to string is {}", s );
}
