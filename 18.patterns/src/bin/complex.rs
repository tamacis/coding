struct Point {
    x: i32,
    y: i32,
}
fn main() {
let ((feet, inches), Point {x, y}) = ((3, 10), Point { x: 3, y: -10 });

println!("{} feet {} inches", feet, inches);
println!("x {} y {}", x , y);
}