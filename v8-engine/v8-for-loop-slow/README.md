demonstration of for let loop being slower in v8

code in benchmark.js directory require benchmark.js

`for-loop.js` requires `microtime` which has native addon and will only work on node  
there's `for-loop-browser.js` which can work on browser using `console.time`

TODO: use performance api in browsers


