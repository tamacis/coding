#![feature(slice_concat_ext)]
#![feature(specialization)]

use std::fmt;
use std::ops::Deref;
use std::ops::DerefMut;
use std::slice;

struct Wrapper<T>(Vec<T>);

impl<T> fmt::Display for Wrapper<T>
where
    [T]: slice::SliceConcatExt<str>,
    <[T] as slice::SliceConcatExt<str>>::Output: fmt::Display,
{
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "[{}]", self.0.join(", "))
    }
}

// impl<T> fmt::Display for Wrapper<T>
// where
//     T: fmt::Display,
// {
//     default fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
//         let mut comma_separated = String::new();

//         for num in &self.0[0..self.0.len() - 1] {
//             comma_separated.push_str(&num.to_string());
//             comma_separated.push_str(", ");
//         }

//         comma_separated.push_str(&self.0[self.0.len() - 1].to_string());
//         write!(f, "{}", comma_separated)
//     }
// }

impl<T> Deref for Wrapper<T> {
    type Target = Vec<T>;

    fn deref(&self) -> &Vec<T> {
        &self.0
    }
}

impl<T> DerefMut for Wrapper<T> {
    fn deref_mut(&mut self) -> &mut Vec<T> {
        &mut self.0
    }
}

fn main() {
    let mut w = Wrapper(vec![String::from("hello"), String::from("world")]);
    println!("w = {}", w);
    w.push(String::from("2"));
    w.push(String::from("1"));
    w.pop();
    println!("w = {}", w);
    println!("{:?}", [[1, 2], [3, 4]].join(&0));
    let mut v = vec![String::from("hello"), String::from("world")];
    println!("{}", v.join(", "));
    let mut v = vec![1, 3, 4, 5, 6, 6];
    // println!("{}", v.join(", "));
}
