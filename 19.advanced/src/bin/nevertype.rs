// This is read as “the function bar returns never,”
// and functions that return never are called diverging functions.
fn bar() -> ! {
    // infinte loop returns ! .. if you add a break it returns ()
    loop {
        // Continue returns ! so we can match against it
        let guess = String::from("134");
        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };
        println!("{}", guess);
    }
}
enum Optional<T> {
    Some(T),
    None
}
// Another use of ! is in panic
impl<T> Optional<T> {
    pub fn unwrap(self) -> T {
        match self {
            Optional::Some(val) => val,
            Optional::None => panic!("called `Option::unwrap()` on a `None` value"),
        }
    }
}

fn main() {
    bar();
}
