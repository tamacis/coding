fn main() {
    let x = vec![1, 2, 3];
    // FnOnce
    let equal_to_x = move |z| z == x;
    let y = vec![1, 2, 3];

    assert!(equal_to_x(y));

    // Fn
    let x = 2;
    let add_two = |z| z + 2 ;

    let y = 4;
    assert!(add_two(x) == y);

    // FnMut
    struct Freq {
        freq: i32,
        value : i32,
    }
    let mut count = Freq {
        freq : 2,
        value: 10
    };
    let incr = |z: &mut Freq|{ z.freq += 1; z.value};
    
    // Need to assign the return value in a let,
    // otherwise it attempts to borrow `count`
    // twice in the `println!` statement, once as
    // mutable, once as immutable
    let res = incr(&mut count);
    println!(" {} {} ", count.freq, res)
}
