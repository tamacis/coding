

fn factorial(n: i32, t: u64) -> u64 {
    match n {
        1 => t,
        _ => factorial(n - 1 , t * n as u64)
    }
}

fn main() {
    println!("Factorial of 5 is {}", factorial(5, 1) );
}