struct Container(i32, i32);

use std::ops::Sub;

// A trait which checks if 2 items are stored inside of container.
// Also retrieves first or last value.
trait Contains {
    // Define generic types here which methods will be able to utilize.
    type A: Sub;
    type B: Sub<<Self as Contains>::A>;

    fn contains(&self, &Self::A, &Self::B) -> bool;
    fn first(&self) -> Self::A;
    fn last(&self) -> Self::B;
}

impl Contains for Container {
    // Specify what types `A` and `B` are. If the `input` type
    // is `Container(i32, i32)`, the `output` types are determined
    // as `i32` and `i32`.
    type A = i32;
    type B = i32;

    // `&Self::A` and `&Self::B` are also valid here.
    fn contains(&self, number_1: &i32, number_2: &i32) -> bool {
        (&self.0 == number_1) && (&self.1 == number_2)
    }
    // Grab the first number.
    fn first(&self) -> i32 {
        self.0
    }

    // Grab the last number.
    fn last(&self) -> i32 {
        self.1
    }
}

struct Pair(f64, f64);

impl Contains for Pair {
    type A = f64;
    type B = f64;

    // `&Self::A` and `&Self::B` are also valid here.
    fn contains(&self, number_1: &f64, number_2: &f64) -> bool {
        (&self.0 == number_1) && (&self.1 == number_2)
    }
    // Grab the first number.
    fn first(&self) -> f64 {
        self.0
    }

    // Grab the last number.
    fn last(&self) -> f64 {
        self.1
    }
}
fn difference<C: Contains >(container: &C) -> <C::B as Sub<C::A>>::Output {
    container.last() - container.first()
}

fn main() {
    let number_1 = 3;
    let number_2 = 10;

    let container = Container(number_1, number_2);

    println!(
        "Does container contain {} and {}: {}",
        &number_1,
        &number_2,
        container.contains(&number_1, &number_2)
    );
    println!("First number: {}", container.first());
    println!("Last number: {}", container.last());

    println!("The difference is: {}", difference(&container));

    let pair = Pair(4.0, 6.5);
    println!("Does pair have 4.0 and 6.5: {}", pair.contains(&4.0, &6.5));
}
