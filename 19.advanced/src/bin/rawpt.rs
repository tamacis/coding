fn main() {
    let mut num = 5;

    let r1 = &num as *const i32;
    let r2 = &mut num as *mut i32;
    unsafe {
        *r2 = 10;
        println!("{}", *r1);
    }

    // raw pointer to nowhere
    let address = 0x012345usize;
    let r = address as *const i32;
    unsafe {
        println!("{}", *r);
    }
}
