//  custom conditionals must be passed to rustc using the --cfg flag.

#[cfg(some_condition)]
fn conditional_function() {
    println!("condition met!");
}

fn main() {
    conditional_function();
}
