
mod functions;
use functions::another_function;
use functions::five;

fn main() {
    let s : String = String::new();
    
    another_function(5, &s);

    // Expression and statements
     let _x = 5;

    let y = {
        let _x = 3;
        _x + 1
    };
    println!("The value of y is {}", y );

        let x = five();

    println!("The value of x is: {}", x);
}
