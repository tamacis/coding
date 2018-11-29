pub fn function() {
    println!("called `my::nested::function()`");
}

pub fn indirect_access() {
    print!("called `my::nested::indirect_access()`, that\n>\t ");
    private_function();
}

#[allow(dead_code)]
fn private_function() {
    println!("called `my::nested::private_function()`");
}
