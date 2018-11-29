fn main() {
    let names = vec!["Bob", "Frank", "Ferris"];

    // iter() borrows
    for name in names.iter() {
        match name {
            &"Ferris" => println!("There is a rustacean among us!"),
            _ => println!("Hello {}", name),
        }
    }

    // into_iter() consumes
    let names = vec!["Bob", "Frank", "Ferris"];
    for name in names.into_iter() {
        match name {
            "Ferris" => println!("There is a rustacean among us!"),
            _ => println!("Hello {}", name),
        }
    }
    // println!("{}", names[0]); //Error

    // iter_mut() borrows mutably.
    let mut names = vec!["Bob", "Frank", "Ferris"];

    for name in names.iter_mut() {
        match name {
            &mut "Ferris" => println!("There is a rustacean among us!"),
            _ => {
                // &mut &str is not an appropriate type anyway, 
                // because it literally is a mutable pointer to an immutable slice.
                
                *name = "there.";
                println!("Hello {}", name)
            }
        }
    }
}
