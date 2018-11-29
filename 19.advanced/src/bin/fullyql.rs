trait Animal {
    fn baby_name() -> String;
}

struct Dog;

impl Animal for Dog {
    fn baby_name() -> String {
        String::from("puppy")
    }
}
impl Dog {
    fn baby_name() -> String {
        String::from("Spot")
    }
}

fn main() {
    println!("A baby dog is called a {}", Dog::baby_name());
    println!("A baby dog is called a {}", <Dog as Animal>::baby_name());
}

/// Fully Qualified syntax
/// <Type as Trait>::function(receiver_if_method, next_arg, ...)
