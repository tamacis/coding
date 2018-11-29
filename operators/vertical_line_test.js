
'use strict';

let f = (x) => ((-2/3*x)+4);
let g = (x) => (5*x - x^2);

function vlinetest (fn) {

let n=10;
let xy=[];

for ( let i = 0 ; i<(2*n+1) ;i++ ) {
  xy[i]={x:i-n,y:fn(i-n)};
}

console.log(xy);

}

vlinetest(g);
