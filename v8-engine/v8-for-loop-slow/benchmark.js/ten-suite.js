
var Benchmark = require('benchmark');

var suite = new Benchmark.Suite;

suite.add('#1 incrementing a counter with let', function() {
let counter = 0;
while(counter < 1e9) ++counter;
})
.add('#2 assigning to the counter the value of an incrementing function', function() {
function incr(c) { return c+1; }
let counter = 0;
while(counter < 1e9) counter = incr(counter);
})
.add('#3 calling a function (declared only once) that increments the captured counter', function() {
let counter = 0;
function incr() { ++counter; }
while(counter < 1e9) incr();
})
.add('#4 calling a (lambda) function defined in the loop that increments the captured counter', function() {
let counter = 0;
while(counter < 1e9) (()=>{ ++counter; })();
})
.add('#5 calling a (lambda) function defined in the loop to increment the counter without capturing', function() {
let counter = 0;
while(counter < 1e9) {
    const incr = (c)=>c+1;
    counter = incr(counter);
}
})
.add('#6 incrementing a counter with var', function() {
var counter = 0;
while(counter < 1e9) ++counter;
})
.add('#7 assigning to the counter the value of an incrementing function with var', function() {
function incr(c) { return c+1; }
var counter = 0;
while(counter < 1e9) counter = incr(counter);
})
.add('#8 calling a function (declared only once) that increments the captured counter with var', function() {
var counter = 0;
function incr() { ++counter; }
while(counter < 1e9) incr();
})
.add('#9 calling a function(){} IIFE defined in the loop that increments the captured counter', function() {
let counter = 0;
while(counter < 1e9) (function (){ ++counter; })();
})
.add('#10 calling a function defined in the loop to increment the counter without capturing with var', function() {
var counter = 0;
while(counter < 1e9) {
    var incr = (c)=>c+1;
    counter = incr(counter);
}
})

.on('cycle', function(event) {
  console.log(String(event.target) + '\n');
})
.on('complete', function() {
  console.log('Fastest is ' + this.filter('fastest').map('name'));
})
// run async
.run({ 'async': true });
