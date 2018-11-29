// Item is an associated type..  a placeholder

pub trait Iterator {
    type Item;
    // Implementors of this trait will specify the concrete type for Item,
    // and the next method will return an Option containing a value of
    // whatever type the implementor has specified.
    fn next(&mut self) -> Option<Self::Item>;
}
struct Counter {
    count: i32,
}
impl Counter {
    fn new() -> Counter {
        Counter { count: 0 }
    }
}
impl Iterator for Counter {
    type Item = i32;

    fn next(&mut self) -> Option<Self::Item> {
        self.count += 1;
        if self.count < 3 {
            Some(self.count)
        } else {
            None
        }
    }
}

fn main() {
    let mut c = Counter::new();
    loop {
        let next;
        match c.next() {
            Some(val) => next = val,
            None => break,
        };
        let x = next;
        println!("{}", x);
    }
}


pub trait IteratorGeneric<T> {
    fn next(&mut self) -> Option<T>;
}