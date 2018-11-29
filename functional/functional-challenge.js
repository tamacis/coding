
/*
Write the functions foundIn and not so that the above example works. 
For input {body: "foo", data: "bar"} an error should be thrown: Missing fields: headers, users.

    var foundIn = (mf) => (e,i,a) => ((a)?(mf.every((me)=>me===e)):mf) ;
    
   // todo: add conditions for a.length=1  
   var not = (fi) => ( (e,i,a) => {
   let mf=fi(0);
   if (i===0) {
   let _a=a.map(e=>e);
   a[i+1]=mf.filter((s=>!_a.includes(s))); }
   else if (i===1) {return true};
   });
*/

"use strict";
    
    
    


/*
let foundIn = collection => 
element => collection.indexOf(element) > 0;

let not = func => 
         (...args) => !func(...args);
*/


var foundIn = (c) => (e) =>  (c.indexOf(e) !== -1)  ;
    
   // spreads could be used here.. but for quick testing in node 
   var not = fi => (e,i,a) => !fi(e,i,a);
   
var request = {body:{body: "foo", data: "bar"}};

var mandatoryFields = ['body', 'headers', 'data', 'users'];
var data = request.body;

if (!mandatoryFields.every(foundIn(Object.keys(data)))) {
    throw new Error('Missing fields: ' + mandatoryFields.filter(not(foundIn( Object.keys(data)))).join(', '));
}

/* Orginally given :

if (!Object.keys(data).every(foundIn(mandatoryFields))) {
    throw new Error('Missing fields: ' + Object.keys(data).filter(not(foundIn(mandatoryFields))).join(', '));
}
*/
