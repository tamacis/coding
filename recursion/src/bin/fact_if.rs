pub fn factorial(n: i32, acc: i32) -> i32 {
    if n <= 1 {
        acc
    } else {
        factorial(n - 1, acc * n)
    }
}
fn main() {
    let y = factorial(10, 1);
    println!("{}", y)
}
