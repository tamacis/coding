pub trait Summarizable {
    fn author_summary(&self) -> String;

    fn summary(&self) -> String {
        format!("(Read more from {}...)", self.author_summary())
    }
}

pub struct NewsArticle {
    pub headline: String,
    pub location: String,
    pub author: String,
    pub content: String,
}

impl Summarizable for NewsArticle {
        fn author_summary(&self) -> String {
        format!("@{}", self.author)
    }
    fn summary(&self) -> String {
        format!("{}, by {} ({})", self.headline, self.author, self.location)
    }
}

pub struct Tweet {
    pub username: String,
    pub content: String,
    pub reply: bool,
    pub retweet: bool,
}

impl Summarizable for Tweet {
    fn summary(&self) -> String {
        format!("{}: {}", self.username, self.content)
    }
        fn author_summary(&self) -> String {
        format!("@{}", self.username)
    }
}

struct WeatherForecast {
    high_temp: f64,
    low_temp: f64,
    chance_of_precipitation: f64,
}
// Use default implementation
impl Summarizable for WeatherForecast {
    fn author_summary(&self) -> String {
        format!("Not available")
    }

}
// impl Summarizable for WeatherForecast {
//     fn summary(&self) -> String {
//         format!(
//             "The high will be {}, and the low will be {}. The chance of
//         precipitation is {}%.",
//             self.high_temp, self.low_temp, self.chance_of_precipitation
//         )
//     }
// }

// Bounded traits on 
pub fn notify<T: Summarizable>(item: T) {
    println!("Breaking news! {}", item.summary());
}

// multi bonded traits
fn some_function<T, U>(t: T, u: U) -> i32
    where T: Display + Clone,
          U: Clone + Debug
{}

fn main() {
    let tweet = Tweet {
        username: String::from("horse_ebooks"),
        content: String::from("of course, as you probably already know, people"),
        reply: false,
        retweet: false,
    };
    let today = WeatherForecast {
        high_temp: 100.0,
        low_temp: 20.0,
        chance_of_precipitation: 12.3,
    };
    let article = NewsArticle {
        headline: String::from("Penguins win the Stanley Cup Championship!"),
        location: String::from("Pittsburgh, PA, USA"),
        author: String::from("Iceburgh"),
        content: String::from(
            "The Pittsburgh Penguins once again are the best
    hockey team in the NHL.",
        ),
    };

    println!("New article available! {}", article.summary());
    println!("1 new tweet: {}", tweet.summary());
    println!("WeatherForecast is {}", today.summary())
}
