/// Returns FibonacciIterator up until n
/// n: the max range you want to calculate
/// start: whether you want to start the sequence at 0 or 1.
/// However, fibo_tuples isn't tail call optimized.
/// 
pub struct FibonacciIterator();
pub fn fibo(n: i32, start: i32) -> FibonacciIterator {
    let second = 1; // doesn't matter if we start a 0 or 1. the second sequence is
    second;
    FibonacciIterator()
}
fn fibo_tuples(n: i32, (p, q): (u64, u64)) -> (u64, u64) {
    if (n <= 1) {
        (p, q)
    } else {
        fibo_tuples(n - 1, (p + q, p + q + q))
    }
}

fn main() {
    println!("Fibonacci sequence");

    for i in (1..14) {
        print!("{:?} ", fibo_tuples(i, (0, 1)));
    }
    println!();
    for i in (1..9) {
        print!("{:?} ", fibo_tuples(i, (1, 1)));
    }
    println!();
}
