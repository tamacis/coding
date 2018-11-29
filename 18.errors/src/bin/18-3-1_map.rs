use std::num::ParseIntError;

// As with `Option`, we can use combinators such as `map()`.
// This function is otherwise identical to the one above and reads:
// Modify n if the value is valid, otherwise pass on the error.
fn multiply(first_number_str: &str, second_number_str: &str) -> Result<i32, ParseIntError> {
    first_number_str.parse::<i32>().and_then(|first_number| {
        second_number_str.parse::<i32>().map(|second_number| 
                                                first_number * second_number)
    })
}

// or using ?
fn multiply_propogate(first_number_str: &str, second_number_str: &str) -> Result<i32, ParseIntError> {
 let first = first_number_str.parse::<i32>()?;
 let second = second_number_str.parse::<i32>()?;
 Ok(first * second)
}

fn print(result: Result<i32, ParseIntError>) {
    match result {
        Ok(n)  => println!("n is {}", n),
        Err(e) => println!("Error: {}", e),
    }
}

fn main() {
    // This still presents a reasonable answer.
    let twenty = multiply("10", "2");
    print(twenty);

    // The following now provides a much more helpful error message.
    let tt = multiply("t", "2");
    print(tt);

    let thirty = multiply_propogate("15", "2");
    print(thirty);
}
