fn main() {
    // A counter variable
    let mut n = 1;

    // Loop while `n` is less than 101
    while n < 101 {
        if n % 15 == 0 {
            println!("{} fizzbuzz", n);
        } else if n % 3 == 0 {
            println!("{} fizz", n);
        } else if n % 5 == 0 {
            println!("{} buzz", n);
        } else {
            // println!("{}", n);
        }

        // Increment counter
        n += 1;
    }
}
