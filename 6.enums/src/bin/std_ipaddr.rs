#[derive(Debug)]
struct Ipv4Addr {
    // details elided
}

#[derive(Debug)]
struct Ipv6Addr {
    // details elided
}

#[derive(Debug)]
enum IpAddr {
    V4(Ipv4Addr),
    V6(Ipv6Addr),
}

enum Message {
    Quit,
    Move { x: i32, y: i32 },
    Write(String),
    ChangeColor(i32, i32, i32),
}

struct QuitMessage; // unit struct
struct MoveMessage {
    x: i32,
    y: i32,
}
struct WriteMessage(String); // tuple struct
struct ChangeColorMessage(i32, i32, i32); // tuple struct

impl Message {
    fn call(&self) {
        // method body would be defined here
    }
}

fn main() {
    let ipv4 = Ipv4Addr {};
    let ipv6 = Ipv6Addr {};
    let home = IpAddr::V4(ipv4);
    let loopback = IpAddr::V6(ipv6);

    println!("{:?}", home);
    println!("{:?}", loopback);

    let m = Message::Write(String::from("hello"));
    m.call();
}
