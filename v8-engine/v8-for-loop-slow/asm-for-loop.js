var microtime = require('microtime');

var start,end;
(function(){
"use asm";
  start = microtime.now();
  for(var i = 0; i < 1e8;){++i;}
  end = microtime.now();
}());

console.log(`for_var_loop took ${end-start}us`);