#![allow(dead_code)]

mod outer;

pub mod outermost {
    pub fn middle_function() {}

    fn middle_secret_function() {}

   mod inside {
        pub fn inner_function() {
            ::outermost::middle_secret_function()
        }

        fn secret_function() {}
    }
}

fn try_me() {
    outermost::middle_function();
    // outermost::middle_secret_function(); 
    // outermost::inside::inner_function();
    // outermost::inside::secret_function(); 

    // outer::inner::inner_fn();
}


#[cfg(test)]
mod tests;
