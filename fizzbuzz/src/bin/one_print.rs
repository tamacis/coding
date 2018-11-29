fn main() {
    for i in 1..101 {
        let x;
        let result = if i % 15 == 0 {
            "FizzBuzz"
        } else if i % 5 == 0 {
            "Buzz"
        } else if i % 3 == 0 {
            "Fizz"
        } else {
            x = i.to_string();
            &*x
        };
        println!("{}", result);
    }
}
