// externing crate for test-only use
#[cfg(test)]
#[macro_use]
extern crate pretty_assertions;

// extern crate we're testing, same as any other code would do.
extern crate testing;

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_add_pretty() {
        assert_eq!(add(2, 3), 5);
    }
}
