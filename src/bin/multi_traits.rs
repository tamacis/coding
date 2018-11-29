trait Card {
    fn draw(&self) -> i32 {
        0
    }
}

trait Shape {
    fn draw(&self) -> i32 {
        1
    }
}
struct Bar {
    text: String
}
impl Card for Bar {}
impl Shape for Bar {}

fn main() {
    let b = Bar {
        text : "test".to_string()
    };
    // println!("{}", b.draw()); // Ambugious 
    // println!("{}", Bar::draw(&b)); Same 
    println!("{}", Card::draw(&b));
    println!("{}", Shape::draw(&b))
}
