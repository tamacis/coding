

use network::server;

    #[test]
    pub fn it_works() {
        ::network::client::connect();
        server::connect();
    }