

  /* a modified copy pasta script to serve static content from a specified directory, */

  var fs = require('fs');
  var path = require('path');
  var url = require('url');
  var url = require('url');
  var http = require('http');


  var static = (function (static) {
  /* Options 
   {
   dir : path,
   host : host,
   port : number
   }
  */
    static.init = function(opts) {
    opts = opts || settings.defaults;
    console.log(opts)
    http.createServer(static.serve)
    .listen(opts.port);
    }
   
    static.serve = function (req,res) {
    console.log(req.url);
    static.fileExists(req.url);
    }

    static.fileExists = function(url) {
    // this will just check if the file exists on server.
    var uri = url.parse(req.url).pathname;
    var filename = path.join(dir,unescape(uri));
    console.log(filename);
   }

  return static;
  })(Object.create(null));

  var settings = {
     defaults : {
     dir : './public',
     host : 'localhost',
     port :  8080
     },
    
     mimes : {
        "html": "text/html",
        "jpeg": "image/jpeg",
        "jpg": "image/jpeg",
        "png": "image/png",
        "js": "text/javascript",
        "css": "text/css"
     }
  }


   static.init();

   module.exports = static;
  