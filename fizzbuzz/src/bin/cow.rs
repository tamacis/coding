use std::borrow::Cow;

fn fizz_buzz(i: i32) -> Cow<'static, str> {
    if i % 15 == 0 {
        "FizzBuzz".into()
    } else if i % 5 == 0 {
        "Buzz".into()
    } else if i % 3 == 0 {
        "Fizz".into()
    } else {
        i.to_string().into()
    }
}
fn main() {
    for i in 1..101 {
        println!("{}", fizz_buzz(i));
    }
}
