fn main() {
    // str, not &str, but str on its own. str is a Dynamically Sized Type
    // &str is two values: the address of the str and how long it is. 
    // we can combine str with all kinds of pointers: Box<str>, for example, or Rc<str>
    let s1 = Box::new("Hello there!");
    let s2 = Box::new("How's it going?");

    println!("{} ", s1);
    println!("{}", s2)
}

// Sized trait
fn generic_sized<T: Sized>(t: T) {
    // --snip--
}

//A trait bound on ?Sized is the opposite of a trait bound on Sized; 
// that is, we would read this as “T may or may not be Sized”. 
// This syntax is only available for Sized, no other traits.
fn generic_unsized<T: ?Sized>(t: &T) {
    // --snip--
}
