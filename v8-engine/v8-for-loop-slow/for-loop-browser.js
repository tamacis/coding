
var microtime = require('microtime')

// @microtimer
// function for_let_loop() .. okay no :(

{ //block scoping :D
const start = console.time();
for(let i = 0; i < 1e8; ++i){}
const end = console.timeEnd(start);
console.log(`for_let_loop took ${end}ms`);
}

{ //block scoping :D
const start = microtime.now();
let i = 0;
for(; i < 1e8; ++i){}
const end = microtime.now();
console.log(`for_let_outside took ${end-start}us`);
}

{ //block scoping :D
const start = microtime.now();
let i = 0;
for(; i < 1e8; ++i){const k=i;}
const end = microtime.now();
console.log(`for_let_outside_const_inside took ${end-start}us`);
}

{ //block scoping :D
const start = microtime.now();
let i = 0;
for(; i < 1e8; ++i){let k=i;}
const end = microtime.now();
console.log(`for_let_outside_let_inside took ${end-start}us`);
}


// var isn't block scoped anyway :|
const start = microtime.now();
for(var i = 0; i < 1e8; ++i){}
const end = microtime.now();
console.log(`for_var_loop took ${end-start}us`);

