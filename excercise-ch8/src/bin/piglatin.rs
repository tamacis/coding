fn main() {
    let str1 = String::from("apple");
    let str2 = "first";

    println!("{}", pig_latin(&str1));
    println!("{}", pig_latin(str2));
    println!("{}", pig_latin(""));
}

fn pig_latin(s: &str) -> String {
    let mut chars = s.chars();
    // if the String is empty, we'll return an empty string
    let first = match chars.next() {
        Some(t) => t,
        None => return String::from(""),
    };
    if is_vowel(&first) {
        format!("{}-hay", s)
    } else {
        let substr = chars.collect::<String>();
        format!("{}-{}ay", substr, first)
    }
}

fn is_vowel(c: &char) -> bool {
    let vowels = ['a', 'e', 'i', 'o', 'u'];
    vowels.contains(&c)
}
