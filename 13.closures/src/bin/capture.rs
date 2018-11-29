fn main() {
    let x = 4;

    // closures can use variables in the outer scope
    let equal_to_x = |z| z == x;

    let y = 4;

    assert!(equal_to_x(y));

    // not with a fn!!
    // can't capture dynamic environment in a fn item
    // fn equal_to_x(z: i32) -> bool {
    //     z == x
    // }
}
