fn main() {
    let v1 = vec![1, 2, 3];

    let v1_iter = v1.iter();

    for val in v1_iter {
        println!("Got: {}", val);
    }
    iterator_demonstration();
    iterator_sum();
    iterator_map();
}

fn iterator_map() {
    let v1: Vec<i32> = vec![1, 2, 3];

    let v2: Vec<_> = v1.iter().map(|x| x + 1).collect();

    assert_eq!(v2, vec![2, 3, 4]);
}
fn iterator_sum() {
    let mut v1 = vec![1, 2, 3];

    {
        let v1_iter = v1.iter();
        let total: i32 = v1_iter.sum();

        assert_eq!(total, 6);
    }
    let mut v2_iter = v1.iter_mut();
    if let Some(val) = v2_iter.next() {
        println!("{}", val);
    };
}

fn iterator_demonstration() {
    let v1 = vec![1, 2, 3];

    let mut v1_iter = v1.iter();

    assert_eq!(v1_iter.next(), Some(&1));
    assert_eq!(v1_iter.next(), Some(&2));
    assert_eq!(v1_iter.next(), Some(&3));
    assert_eq!(v1_iter.next(), None);
}