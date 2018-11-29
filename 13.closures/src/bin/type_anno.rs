fn main() {
    fn add_one_v1(x: u32) -> u32 {
        x + 1
    }
    let add_one_v2 = |x: u32| -> u32 { x + 1 };
    let add_one_v3 = |x| x + 1;
    let add_one_v4 = |x| x + 1;

    add_one_v3(1);
    add_one_v4(2);

    let example_closure = |x| x;

    // The first time we call example_closure with the String value,
    // the compiler infers the type of x and the return type of the closure to be String.
    // Those types are then locked in to the closure in example_closure,
    // and we get a type error if we try to use a different type with the same closure.

    let s = example_closure(String::from("hello"));
    // let n = example_closure(5);
}
