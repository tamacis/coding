#[macro_export]
macro_rules! vect {
    ( $( $x:expr ),* ) => {
        {
            let mut temp_vec = Vec::new();
            $(
                temp_vec.push($x);
            )*
            temp_vec
        }
    };
}

fn main() {
    let x  = vect!(1,3,4,5,6);
    for i in x.iter() {
        println!("{}",i );
    }
}