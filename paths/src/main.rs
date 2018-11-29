
use std::path::{Path, PathBuf};
fn main() {
    let paths = vec![PathBuf::from("foo"), PathBuf::from("bar")];
    takes_paths(&paths[..]);
}

fn takes_paths(s: &[&Path]) {
    for p in s.iter() {
        println!("{}", p.display());
    }
}
