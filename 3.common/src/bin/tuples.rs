fn main() {
    let tup: (i32, f64, u8) = (500, 6.4, 1);

    // destructuring
    let (x, y, z) = tup;

    println!("The value of y is: {}", y);

    let five_hundred = x.0;

    let six_point_four = x.1;

    let one = x.2;

    // Arrays 
    let a = [1, 2, 3, 4, 5];
        let first = a[0];
    let second = a[1];

    let months = ["January", "February", "March", "April", "May", "June", "July",
              "August", "September", "October", "November", "December"];

}
