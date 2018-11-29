#![feature(fnbox)]

use std::boxed::FnBox;
use std::collections::HashMap;

fn make_map() -> HashMap<i32, Box<FnBox(i32) -> i32>> {
    let mut map: HashMap<i32, Box<FnBox(i32) -> i32>> = HashMap::new();
    map.insert(1, Box::new(|x| x + 22));
    map.insert(2, Box::new(|y| y + 44));
    map
}

fn main() {
    let mut map = make_map();
    for i in &[1, 2] {
        let f = map.remove(&i).unwrap();
        println!("{}", f(*i));
    }
}
