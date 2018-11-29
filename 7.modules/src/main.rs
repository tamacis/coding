pub mod network;

use network::client;

// paths are always relative to the current module
// the only exception is in a use statement, 
// where paths are relative to the crate root by default

fn main() {
    // relative to the current module
    network::client::connect();
    // use network::client
    client::connect();
    // :: from the root
    ::network::client::connect();
    // ::self 
    self::network::client::connect();
}
