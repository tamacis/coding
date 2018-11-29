fn main() {
    let pair = (0, -2);
    pair_check(pair);
    // TODO ^ Try different values for `pair`
    let pair = (3, 0);
    pair_check(pair);
    let pair = (10, 20);
    pair_check(pair);
}

fn pair_check(pair: (i32, i32)) {
    match pair {
        // Match can be used to destructure a tuple
        // Destructure the second
        (0, y) => println!("First is `0` and `y` is `{:?}`", y),
        (x, 0) => println!("`x` is `{:?}` and last is `0`", x),
        _ => println!("It doesn't matter what they are"),
        // `_` means don't bind the value to a variable
    }
}
