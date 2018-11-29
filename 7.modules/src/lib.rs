

pub mod network;
pub mod tests;
use network::server;


pub fn foo() {
    server::connect();
  tests::it_works();
}