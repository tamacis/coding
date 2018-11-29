extern crate rand;

use rand::Rng;
use std::cmp::Ordering;
// use std::collections::HashMap;

fn main() {
    let mut a = [2, 42, 82, 86, 122, 128, 162, 168, 202, 242, 282, 322, 362];
    println!("length of a {}", a.len());

    a.sort_by(|_l, _r| {
        if rand::thread_rng().gen_range(1, 10) < 5 {
            Ordering::Less
        } else {
            Ordering::Greater
        }
    });

    for n in a.iter() {
        print!("{}, ", n)
    }
}
