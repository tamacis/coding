

fn borrow(s : String) -> String {
    s
}

fn refrence(s : &str) -> &str {
    &s[..]
}

fn main() {
    let s = String::from("Hello");
    let s = borrow(s);

    println!("{}", s);

    let s = refrence("World");
    println!("{}", s)
}