

 var Benchmark= require('benchmark');

 var suite = new Benchmark.Suite;


var arr = [23,67,57,86,89,56,09,90,12,33];
var search=86;

var obj={};
obj.method=function() {return true};

suite.add('direct call' , function () {
obj.method();
/*
var i=0;
var l = arr.length;

for(;i<l;i++) {
if (search == arr[i] ) { return true};
}
*/
})

 .add('indirect call', function () {
  
/*
 var i=0;
 var l=arr.length;
for ( ; i < l; ) { 
if(search == arr[i] ) {return true;}
else if (search == arr[i+1]) {return true; }
i+=2;
}
*/

})

 .on('cycle',  function (event) {
 console.log(String(event.target));
})
 .on('complete',  function () {
 console.log('Fastest : ' + this.filter('fastest').pluck('name'));
})
 .run ({async : true });