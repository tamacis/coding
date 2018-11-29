fn sum(n: i32, t: u64) -> u64 {
    match n {
        0 => t,
        _ => sum(n - 1 , t + n as u64)
    }
}

fn main() {
    println!("Sum of first 10 numbers is {}", sum(10, 0) );
    println!("Sum of first 1000 numbers {}", sum(1000, 0) );
    // The following is stack overflow on debug builds
    // But runs on optimized builds
    println!("Sum of first 100_000_000 numbers {}", sum(100_000_000, 0) );
}