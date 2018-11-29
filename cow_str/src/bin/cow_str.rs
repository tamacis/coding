extern crate cow_str;

use std::borrow::Cow;
use cow_str::secret_from_vault;

struct Token<'a> {
    raw: Cow<'a, str>,
}

impl<'a> Token<'a> {
    pub fn new(raw: Cow<'a, str>) -> Token<'a> {
        Token { raw: raw }
    }
}

fn main() {
    // Create the tokens.
    let token = Token::new(Cow::Borrowed("abc123"));
    let secret: String = secret_from_vault("api.example.io");
    let token = Token::new(Cow::Owned(secret));
}
