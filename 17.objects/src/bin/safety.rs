pub trait Cloneable {
    fn create(&self) -> Self;
}

impl Cloneable for String {
    fn create(&self) -> Self {
        self.clone()
    }
}
//  the trait `Cloneable` cannot be made into an object
// pub struct Screen {
//     pub components: Vec<Box<Cloneable>>,
// }

fn main() {
    let s = String::from("Hello");
    let t = s.create();
    println!("{}", s);
}
