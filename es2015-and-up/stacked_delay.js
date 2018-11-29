



'use strict';
function stackedDelay(fn,dly ) {
let stck=[];
let last;
let nx=0

return (...args) => {
var ctx=this;
let now=+(new Date());
stck.push(fn);
if ( last && now < last + dly ) {
clearTimeout(timer);

timer = setTimeout(() => 
      {
         last=now;
         stck[nx].apply(ctx,args);
      ,dly}
}else {
last=now;
stck[nx].apply(ctx,args);
}
};

}
