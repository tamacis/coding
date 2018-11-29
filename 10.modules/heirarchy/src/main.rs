#![feature(non_modrs_mods)]
// This declaration will look for a file named `my.rs` or `my/mod.rs` and will
// insert its contents inside a module named `my` under this scope
mod my;

fn function() {
    println!("called `function()`");
}


fn main() {
    function();

    my::function();

    my::indirect_access();

    my::nested::function();

    my::nested::indirect_access();
}
