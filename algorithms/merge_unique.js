var mergeUniqueItems = [
"-JsDEcxz_ZSGFLKwd1QM", 
"-JsJ2NXGDYKI6QRsuXVK", 
"-JsJ2RK-kOG2eGcG04xF", 
"-JsJ2RK-kOG2eGcG04xF", 
"-JsJ2YLPiP6751zh8geS"]

var duplicateArray= mergeUniqueItems.filter(function(v,i,a) {
delete a[i];
return (a.indexOf(v) > 1 );
});

console.log(mergeUniqueItems);
console.log(duplicateArray);