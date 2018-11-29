#![feature(specialization)]

struct Swallow();

// Copying the standard 
pub trait Fromable<T> {
    fn from(T) -> Self;
}

// Anything can be converted to itself
default impl<T> Fromable<T> for T {
    fn from(s: T) -> T {
        s
    }
}

// Anything can be swallowed
impl<T> Fromable<T> for Swallow {
    fn from(s: T) -> Swallow {
        Swallow()
    }
}

fn main() {}
