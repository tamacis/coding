#![feature(optin_builtin_traits)]

#[derive(Debug)]
// A type that can can be converted to
struct Swallow();

//  Negative trait bound
auto trait NotSwallow {}
impl !NotSwallow for Swallow {}

// since From is reflexive it causes conflicting error
impl<T: NotSwallow> std::convert::From<T> for Swallow {
    fn from(_s: T) -> Self {
        Swallow()
    }
}

fn main() {
    let s = Swallow::from("hello");
    println!("{:?}", s);
    let vec = vec![1, 2, 3, 4, 5];
    let s2 = Swallow::from(vec);
    println!("{:?}", s2);
}
