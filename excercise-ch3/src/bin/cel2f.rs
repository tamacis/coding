extern crate regex;
use regex::Regex;
use std::io;

fn cel_to_faren(c: f64) -> f64 {
    c * 1.8 + 32.0
}

fn faren_to_cel(f: f64) -> f64 {
    (f - 32.0) / 1.8
}

fn main() {
    println!("Enter number followed by c and f");
    println!("to convert between the two.");
    println!("Empty line quits.");

    // compile regex outisde of loop
    let re = Regex::new(r"(?i)(?P<value>\d+)(?P<unit>[cf])").unwrap();

    let mut input = String::new();
    loop {
        // Clear the string buffer so readline can mutate it..
        input.clear();
        io::stdin()
            .read_line(&mut input)
            .expect("Failed to read line");

        if input == "\n" {
            break;
        } else if !re.is_match(&input) {
            println!("Invalid input.");
            continue;
        }

        let captures = re.captures_iter(&input).next().unwrap();
        let (value, unit) = (&captures["value"], &captures["unit"]);

        let value = value.parse::<f64>().unwrap();

        match unit {
            "f" => {
                let f = faren_to_cel(value);
                println!("{}°F is {:.*}°C", value, 2, f);
            }
            "c" => {
                let c = cel_to_faren(value);
                println!("{}°C is {:.*}°F", value, 2, c);
            }
            &_ => {}
        }
    }
}
