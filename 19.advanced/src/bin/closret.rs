/// Rust doesn’t know how much space it’ll need to store the closure.
///
// fn returns_closure() -> Fn(i32) -> i32 {
//     |x| x + 1
// }

//  though: we can use a trait object:
fn returns_closure_boxed() -> Box<Fn(i32) -> i32> {
    Box::new(|x| x + 1)
}

fn main() {
    let res = returns_closure_boxed()(3);
    println!("{}", res)
}
