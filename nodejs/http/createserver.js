
"use strict";
var http = require('http');
var request = require('request');
 
var server = http.createServer(function (req, res) {
    res.write(req.url.slice(1) +' ');
    setTimeout(res.end.bind(res), 5000);
});
 
server.listen(8000, function () {
    var pending = 20;
    for (let i = 0; i < 20; i++) {
        let r = http.request({
        hostname : "localhost.com",
        port : 8000,
        method : "GET"
        },
        function (res) {
        
        res.pipe(process.stdout, { end: false });
        res.on('end', function () {
            if (--pending === 0) server.close();
        }
        )
         r.on("error",console.log);
         r.write("i");
         r.end(); 
        });
        
    }
});

process.stdout.setMaxListeners(20);