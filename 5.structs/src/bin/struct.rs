struct User {
    username: String,
    email: String,
    sign_in_count: u64,
    active: bool,
}

struct Color(i32, i32, i32);
struct Point(i32, i32, i32);
struct UnitStruct();

fn main() {
    let _user1 = User {
        email: String::from("someone@example.com"),
        username: String::from("someusername123"),
        active: true,
        sign_in_count: 1,
    };

    let _user2 = User {
        email: String::from("another@example.com"),
        username: String::from("anotherusername567"),
        active: _user1.active,
        sign_in_count: _user1.sign_in_count,
    };

    let _user2 = User {
        email: String::from("another@example.com"),
        username: String::from("anotherusername567"),
        .._user1
    };

    let _user3 = build_user(String::from("someone@example.com"), String::from("someone"));
    println!("{} {}", _user3.email, _user3.username );
    let _black = Color(0, 0, 0);
    let _origin = Point(0, 0, 0);

    let _unit = UnitStruct{};
}

fn build_user(email: String, username: String) -> User {
    User {
        email,
        username,
        active: true,
        sign_in_count: 1,
    }
}
