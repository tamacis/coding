use std::collections::HashMap;
use std::fmt;
fn main() {
    let list = vec![1, 2, 3, 4, 8, 5, 6, 7, 8];
    // can call with array too
    let arr = [1, 2, 3, 4, 7, 9];
    // doesnt panics on zero elements
    show(Statistics::average(&[]));
    show(Statistics::average(&arr));
    show(Statistics::average(&list));

    show(Statistics::median(&[]));
    show(Statistics::median(&arr));
    show(Statistics::median(&list));

    show(Statistics::mode(&[]));
    show(Statistics::mode(&arr));
    show(Statistics::mode(&list));
}
struct Statistics<T> {
    operation: &'static str,   // operations are string literals..
    result: Result<T, String>, // Err could be runtime specific so String
}

fn show<T>(s: Statistics<T>)
where
    T: fmt::Display,
{
    match s.result {
        Ok(t) => println!("The {} is {}", s.operation, t),
        Err(e) => println!("{}", e),
    }
}

fn is_even(n: usize) -> bool {
    n % 2 == 0
}

impl Statistics<f64> {
    fn invalid_data<U>() -> Statistics<U> {
        Statistics::<U> {
            result: Err("Invalid data provided.".to_string()),
            operation: "",
        }
    }

    fn average(l: &[i32]) -> Statistics<f64> {
        if l.len() == 0 {
            return Statistics::invalid_data();
        }
        let sum: f64 = l.iter().map(|&v| v as f64).sum();
        let result = Ok(sum / (l.len() as f64));
        Statistics::<f64> {
            result,
            operation: "average",
        }
    }

    fn median(l: &[i32]) -> Statistics<f64> {
        if l.len() == 0 {
            return Statistics::invalid_data();
        }

        l.to_owned().sort();
        let n = l.len();

        let result;
        if is_even(n) {
            // index starts at 0
            let p = (n - 2) / 2; // (n - 1) / 2
            let r = n / 2; // (n + 1) / 2
            result = Ok((l[p] as f64 + l[r] as f64) / 2 as f64)
        } else {
            result = Ok(l[n / 2] as f64)
        }
        Statistics::<f64> {
            result,
            operation: "median",
        }
    }

    fn mode(l: &[i32]) -> Statistics<i32> {
        if l.len() == 0 {
            return Statistics::invalid_data();
        }
        let mut freqs: HashMap<i32, i32> = HashMap::new();

        for e in l.iter() {
            let count = freqs.entry(*e).or_insert(0);
            *count += 1;
        }
        // return the highest frequency:
        struct Highest {
            value: i32,
            freq: i32,
        }

        let mut highest = Highest { value: 0, freq: 0 };

        for (&k, &v) in freqs.iter() {
            if v > highest.freq {
                highest.freq = v;
                highest.value = k;
            }
        }
        // No mode found..
        let result = if highest.freq == 1 {
            Err("All elements occur exactly once.".to_string())
        } else {
            Ok(highest.value)
        };
        return Statistics::<i32> {
            result,
            operation: "mode",
        };
    }
}
