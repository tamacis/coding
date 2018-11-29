use std::env;

fn env_is_set() -> bool {
    match env::var("ENVIRONMENT_VARIABLE") {
        Ok(s) => s == "yes",
        _ => false,
    }
}
#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn when_set_yes() {
        env::set_var("ENVIRONMENT_VARIABLE", "yes");
        assert!(env_is_set());
    }

    #[test]
    fn when_set_no() {
        env::set_var("ENVIRONMENT_VARIABLE", "no");
        assert!(!env_is_set());
    }

    #[test]
    fn when_unset() {
        env::remove_var("ENVIRONMENT_VARIABLE");
        assert!(!env_is_set());
    }
}
