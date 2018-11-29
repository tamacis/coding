use List::{Cons, Nil};
use std::fmt;

enum List<T: fmt::Display> {
    Cons(T, Box<List<T>>),
    Nil,
}

impl<T: fmt::Display> List<T> {
    /// Recurses into the List, and applies the closure to each value
    fn each<U: Fn(&T) -> ()>(&self, call: U) {
        match self {
            &Cons(ref i, ref b) => {
                call(i);
                b.each(call)
            }
            &Nil => (),
        }
    }
}

fn main() {
    let b = Box::new(5);
    println!("b = {}", b);

    let list = Cons(1, Box::new(Cons(2, Box::new(Cons(3, Box::new(Nil))))));
    list.each(|x| println!("{}", x));
    // list.iter().for_each(|x| println!("{}", x));
}

// impl<T: fmt::Display> Iterator for List<T> {
//     type Item = T;

//     fn next(&mut self) -> Option<Self::T> {

//         }
//     }
// }
