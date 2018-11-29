extern crate rand;

fn main() {
    // Rng is the main trait and needs to be imported:
    use rand::{thread_rng, Rng};

    // thread_rng is often the most convenient source of randomness:
    let mut rng = thread_rng();

    let x: f64 = rng.gen(); // random number in range (0, 1)
    println!("x is: {}", x);
    println!("Number from 0 to 9: {}", rng.gen_range(0, 10));
}
