fn main() {
    let items = [
        "a Partridge in a Pear Tree",
        "Three French Hens",
        "Two Turtle Doves",
        "Calling Birds",
        "Gold Rings",
        "Geese a-Laying",
        "Swans a-Swimming",
        "Maids a-Milking",
        "Ladies Dancing",
        "Lords a-Leaping",
        "Pipers Piping",
        "Drummers Drumming",
    ];

    let days = [
        "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
        "tenth", "eleventh", "twelveth",
    ];

    let lnstart_str = |e| format!("On the {} day of Christmas my true love sent to me", e);

    for (index, element) in days.iter().enumerate() {
        println!("{}", lnstart_str(element));
        for n in (0..index + 1).rev() {
            match n {
                0 => println!("and {}", items[n]),
                _ => println!("{}", items[n]),
            }
            
        }
        println!("\n");
    }
}
