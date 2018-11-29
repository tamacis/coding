// spaced out functions;
//

'use strict';

function *spaceOut(fn,delay) {
let args=[];
let ctr=0;
let last=-1;
let then = new Date();

while(true) {
args[ctr]=yield last ;
ctr++;
let tnow=new Date();
setInterval((x)=>(fn(args[ctr])),delay);
}


}

// use:

function loggy(msg) {
console.log(msg);
}

let sp = spaceOut(loggy,1000);
for (let i=0; i<=10;i++) {
//console.log ( sp.next().value);
sp.next(i);
}
