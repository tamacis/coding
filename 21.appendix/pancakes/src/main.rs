extern crate hello;
#[macro_use]
extern crate hello_derive;

use hello::HelloWorld;

#[derive(HelloWorld)]
struct Pancakes;

fn main() {
    Pancakes::hello_world();
}