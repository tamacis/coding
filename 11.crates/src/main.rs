extern crate crates;

use crates as rary;

fn main() {
    rary::public_function();

    // Error! `private_function` is private
    // rary::private_function();

    rary::indirect_access();
}
