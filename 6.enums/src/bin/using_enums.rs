#![allow(unused_variables)] 

enum IpAddr {
    V4(String),
    V6(String),
}

enum IpAddrBinary {
        V4(u8, u8, u8, u8),
    V6(String),

}

fn main() {
// Directly using the enum
let home = IpAddr::V4(String::from("127.0.0.1"));

let loopback = IpAddr::V6(String::from("::1"));

let home = IpAddrBinary::V4(127, 0, 0, 1);
let loopback = IpAddrBinary::V6(String::from("::1"));
}