use std::ops::Add;

#[derive(Debug, PartialEq)]
struct Point {
    x: i32,
    y: i32,
}

impl Add for Point {
    type Output = Point;

    fn add(self, other: Point) -> Self::Output {
        Point {
            x: self.x + other.x,
            y: self.y + other.y,
        }
    }
}

fn main() {
    assert_eq!(
        Point { x: 1, y: 0 } + Point { x: 2, y: 3 },
        Point { x: 3, y: 3 }
    );
    add_millis()
}

// default type parameters.
// If we don’t specify a concrete type for RHS when we implement the Add trait,
//  the type of RHS will default to the type of Self (the type that we’re implementing Add on).
trait AddCustom<RHS = Self> {
    type Output;

    fn add(self, rhs: RHS) -> Self::Output;
}

struct Millimeters(u32);
struct Meters(u32);

impl Add for Millimeters {
    type Output = Millimeters;

    fn add(self, other: Millimeters) -> Millimeters {
        Millimeters(self.0 + other.0)
    }
}

impl Add<Meters> for Millimeters {
    type Output = Millimeters;

    fn add(self, other: Meters) -> Millimeters {
        Millimeters(self.0 + (other.0 * 1000))
    }
}

fn add_millis() {
    let a = Millimeters(100);
    let b = Meters(1);
    let sum = (a + b).0;
    println!("Sum of a, b {} millimeters", sum);
}
