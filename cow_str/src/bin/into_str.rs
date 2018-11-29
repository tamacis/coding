struct Token {
    raw: String,
}
impl Token {
    /// Create a new token
    ///
    /// Can be passed either a &str or String
    pub fn new<S>(raw: S) -> Token
    where
        S: Into<String>,
    {
        Token { raw: raw.into() }
    }
}
fn secret_from_vault(s: &str) -> String {
    String::from("255foo")
}
fn main() {
    // &str
    let token = Token::new("abc123");

    // String
    let token = Token::new(secret_from_vault("api.example.io"));
}
