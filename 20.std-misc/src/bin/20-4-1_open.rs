use std::error::Error;
use std::fs::File;
use std::io::prelude::*;
use std::path::Path;

trait Every {}
impl<T: ?Sized> Every for T {}

fn inner_main() -> Result<(), Box<std::error::Error>> {
    // Create a path to the desired file
    let path = Path::new("/tmp/hello.txt");
    let display = path.display();

    // Open the path in read-only mode, returns `io::Result<File>`
    let mut file = File::open(&path)?;

    // Read the file contents into a string, returns `io::Result<usize>`
    let mut s = String::new();
    let str = file.read_to_string(&mut s)?;
    print!("{} contains:\n{}", display, s);

    // `file` goes out of scope, and the "hello.txt" file gets closed
    Ok(())
}

fn main() {
    match inner_main() {
        Err(e) => println!("Error: \n{}", e),
        _ => (),
    }
}
