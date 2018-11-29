enum SpreadsheetCell {
    Int(i32),
    Float(f64),
    Text(String),
}

fn main() {
    enum Test {
        A,
        B,
    }
    // This works
    let _data = vec![Test::A, Test::B];

    // But this doesnt
    use SpreadsheetCell::{Float, Int, Text};

    let _row = vec![Int(3), Text(String::from("blue")), Float(10.12)];
    m::main();
    // hack

    mod m {
        enum Enum {
            A,
            B,
        }
        use self::Enum::*;

        pub fn main() {
            let _data = vec![A, B];
        }
    }
}
