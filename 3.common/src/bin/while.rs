fn main () {
    let mut number = 3;

    while number != 0 {
        println!("{}!", number);

        number = number - 1;
    }

    println!("LIFTOFF!!!");

    using_loop();
}

// Same code using loop, if and break
fn using_loop() {
    let mut number = 3;

    loop {
        if number == 0 {
            break;
        }

        println!("{}!", number);
        number = number - 1;
    }

    println!("LIFTOFF!!!");
}
