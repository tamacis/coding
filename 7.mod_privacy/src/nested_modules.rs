pub mod a {
    pub mod series {
        pub mod of {
            pub fn nested_modules() {}
        }
    }
}
// bring the module into scope;
use a::series::of;
// bring the function of a module into scope;
use a::series::of::nested_modules;

enum TrafficLight {
    Red,
    Yellow,
    Green,
}

use TrafficLight::*;

fn main() {
    a::series::of::nested_modules();

    of::nested_modules();

    nested_modules();
    
    let red = Red;
    let yellow = Yellow;
    let green = Green;
}