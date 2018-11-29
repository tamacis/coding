var wsServer= require('ws').Server;

var wss = new wsServer({port:33030});
wss.on('connection',function (ws) {

ws.on('message',function  (msg)  {
console.log("info","recieved: %s", msg) ;
});

});
