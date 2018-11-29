

fn main() {
    let mut count = 0;
    'outer: loop {
        println!("Entered the outer loop");
        
        'inner: loop {
            println!("Entered the inner loop");
            count +=1;
            // This would break only the inner loop
            // break;

            // This breaks the outer loop
            if count == 2 {
            break 'outer;
            }
        }

        println!("This point will never be reached");
    }

    println!("Exited the outer loop");
}