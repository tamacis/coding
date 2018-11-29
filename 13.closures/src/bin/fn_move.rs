fn main() {
    let x = vec![1, 2, 3];

    let equal_to_x = move |z|{
        println!("can't use x here: {:?}", x);
         z == x
    };



    let y = vec![1, 2, 3];

    assert!(equal_to_x(y));
}