trait Foo {
    fn sayHi(&self) -> &'static str;
}

struct Bar<'a> {
    x: &'a i32,
}

impl<'a> Foo for Bar<'a> {
    fn sayHi(&self) -> &'static str {
        "Hello"
    }
}

fn main() {
    let num = 5;

    let obj = Box::new(Bar { x: &num }) as Box<Foo>;
    println!("{}", obj.sayHi());
}
