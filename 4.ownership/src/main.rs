fn main() {
    // variable scope

    {
        // s is not valid here, it’s not yet declared
        let s = "hello"; // s is valid from this point forward
        println!("{}", s);
        // do stuff with s
    } // this scope is now over, and s is no longer valid

    // You can create a String from a string literal using the from function, like so:
    let _s = String::from("hello");
    let mut s = String::from("hello");

    s.push_str(", world!"); // push_str() appends a literal to a String

    println!("{}", s); // This will print `hello, world!`

    /*
We can probably guess what this is doing based on our experience with other languages: 
“Bind the value 5 to x; then make a copy of the value in x and bind it to y.” 
We now have two variables, x and y, and both equal 5. 
This is indeed what is happening because integers are simple values with a known,
 fixed size, and these two 5 values are pushed onto the stack.
*/

    let x = 5;
    let y = x;
    println!(" {} {}", x, y );
    /*
    When we assign s1 to s2, the String data is copied, meaning we copy the pointer, 
    the length, and the capacity that are on the stack. 
    
    We do not copy the data on the heap that the pointer refers to.
    */
    let s1 = String::from("hello");
    let s2 = s1;
    println!("{}", s2);
    /*  Instead of trying to copy the allocated memory, Rust considers s1 to no longer be 
valid and therefore, 

Rust doesn’t need to free anything when s1 goes out of scope.

If you’ve heard the terms “shallow copy” and “deep copy” while working with other languages, 
the concept of copying the pointer, length, and capacity without copying the data probably 
sounds like a shallow copy. 

But because Rust also invalidates the first variable, instead of calling this a shallow copy,
 it’s known as a move.
*/

    // println!("{}, world!", s1);

/* 
If we do want to deeply copy the heap data of the String, not just the stack data,
 we can use a common method called clone.

*/
    let s1 = String::from("hello");
    let s2 = s1.clone();

println!("s1 = {}, s2 = {}", s1, s2);
}
