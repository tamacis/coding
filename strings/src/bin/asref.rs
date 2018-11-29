// AsRef<str> allows you to pass in both String and &str
// Since both implement as_ref
fn main() {
    let a = "h";
    let b = String::from("h");

    println!("{}", is_help(a));
    println!("{}", is_help(b));
}

fn is_help<S: AsRef<str>> (s : S) -> bool {
    s.as_ref() == "h"
}