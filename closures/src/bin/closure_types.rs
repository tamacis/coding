fn main() {
    let b = true || false;
    println!("{}", b);
    // no two closures, even if identical, have the same type
    // You can't store different types in the same variable!
    // let op = if b { |x| x + 1 } else { |x| x + 2 };

    let op: fn(i32) -> i32 = if b { |x| x + 1 } else { |x| x + 2 };
    println!("{}",op(1));
}
