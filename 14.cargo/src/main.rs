//! # My Crate
//!
//! `my_crate` is a collection of utilities to make performing certain
//! calculations more convenient.

extern crate num_cpus;

fn main() {
    let cpus = num_cpus::get();
    if cpus > 1 {
        println!("We are on a multicore system with {} CPUs", cpus);
    } else {
        println!("We are on a single core system");
    }
}

/// Adds one to the number given.
///
/// # Examples
///
/// ```
/// let five = 5;
///
/// assert_eq!(6, my_crate::add_one(5));
/// ```
pub fn add_one(x: i32) -> i32 {
    x + 1
}
