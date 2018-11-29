fn fizz_buzz(i: i32) -> String {
    if i % 15 == 0 {
        "FizzBuzz".to_string()
    } else if i % 5 == 0 {
        "Buzz".to_string()
    } else if i % 3 == 0 {
        "Fizz".to_string()
    } else {
        i.to_string()
    }
}

fn main() {
    for i in 1..101 {
        println!("{}", fizz_buzz(i));
    }
}
