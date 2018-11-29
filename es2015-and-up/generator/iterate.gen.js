   "use strict";

   var gen = function* () {
     for (let i=0;i<=10;i++) {
     yield i;
     }
   }
   
   var g = gen();
   
   console.log(g.next());
   
   for (let n of g) {
   console.log(n);
   }