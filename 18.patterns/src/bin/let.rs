
#[allow(unused_variables)]
fn main() {
    let (x, y, z) = (1, 2, 3);

    // Ignoring via let
    let (x, y, _, _) = (2, 4, 5, 6);

    let (x, y, ..) = (9, 1, 3, 5, 6, 7);
}
