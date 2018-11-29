use std::slice;
fn main() {
    let address = 0x012345usize;
    let r = address as *mut i32;

    let slice = unsafe { slice::from_raw_parts_mut(r, 10000) };

    for s in slice {
        println!("{}", s);
    }
}
