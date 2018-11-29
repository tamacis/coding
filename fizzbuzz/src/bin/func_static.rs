fn main() {
    fn fizz_buzz(i: i32) -> &'static str {
        let x;
        if i % 15 == 0 {
            "FizzBuzz"
        } else if i % 5 == 0 {
            "Buzz"
        } else if i % 3 == 0 {
            "Fizz"
        } else {
            x = i.to_string();
            &*x
        }
    }

    for i in 1..101 {
        println!("{}", fizz_buzz(i));
    }
}
