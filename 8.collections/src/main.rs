fn main() {
    // Decalres a Vec<T> with Type i32
    let _v: Vec<i32> = Vec::new();

    let _v = vec![1, 2, 3];

    let mut v: Vec<i64> = Vec::new();
    // adding to a vector
    v.push(5);
    v.push(6);
    v.push(7);
    v.push(8);

    // getting element from vector

    let v = vec![1, 2, 3, 4, 5];

    let _third: &i32 = &v[2];
    let _third: Option<&i32> = v.get(2);

    let does_not_exist = v.get(100);
    match does_not_exist {
        None => println!("Enter the value again"),
        Some(i) => println!("You entered {}", i),
    }

    let mut v = vec![100, 32, 57];
    for i in &mut v {
        *i += 50;
    }

}

