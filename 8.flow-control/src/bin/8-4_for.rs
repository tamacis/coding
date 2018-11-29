fn main() {
    // `n` will take the values: 1, 2, ..., 100 in each iteration
    // for n in 1..101 { // range a..b is exclusive b..
    for n in 1..=100 { // range a..=b is inclusive
        if n % 15 == 0 {
            println!("fizzbuzz");
        } else if n % 3 == 0 {
            println!("fizz");
        } else if n % 5 == 0 {
            println!("buzz");
        } else {
            println!("{}", n);
        }
    }
}
