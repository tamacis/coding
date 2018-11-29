fn main() {
    let option = Some(2);

    let x = 3;
    // explicit types:
    let new: Option<i32> = option.map(|val: i32| -> i32 { val + x });
    println!("{:?}", new); // Some(5)

    let y = 10;
    // inferred:
    let new2 = option.map(|val| val * y);
    println!("{:?}", new2); // Some(20)
}