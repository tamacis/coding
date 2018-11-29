
fn main() {
    let a = None;
    let b = Some(2);
    
    let mut result = 0;
    
    if let Some(s) = a {
        result = s;
    } else if let Some(s) = b{
        result = s;
    }

    println!("{}", result);
    
}
