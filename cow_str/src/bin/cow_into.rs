extern crate cow_str;

use cow_str::secret_from_vault;
use std::borrow::Cow;

struct Token<'a> {
    raw: Cow<'a, str>,
}

impl<'a> Token<'a> {
    pub fn new<S>(raw: S) -> Token<'a>
    where
        S: Into<Cow<'a, str>>,
    {
        Token { raw: raw.into() }
    }
}
fn main() {
    // Create the tokens.
    let token = Token::new("abc123");
    let token = Token::new(secret_from_vault("api.example.io"));
}
