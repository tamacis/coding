#[derive(Debug, Clone, Copy)]
struct Color {
    red: u32,
    blue: u32,
    green: u32,
}

fn main() {
    let a = Color {
        red: 255,
        blue: 255,
        green: 0,
    };
    let mut b = a;
    b.green = 20;

    println!("{:?}", a);

    println!("{:?}", b);
}
