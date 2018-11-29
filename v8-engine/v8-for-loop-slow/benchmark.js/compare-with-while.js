
var Benchmark = require('benchmark');

var suite = new Benchmark.Suite;

suite.add('#1 for loop with let', function() {
for(let i=0; i < 1e3; i++);
})
.add('#2 for loop with var', function() {
for(var i=0; i < 1e3; i++);
})
.add('#3 while loop with let', function() {
let counter = 0;
while(counter < 1e3)  counter++;
})
.add('#4 while loop with var', function() {
var counter = 0;
while(counter < 1e3) counter++;
})

.on('cycle', function(event) {
  console.log(String(event.target) + '\n');
})
.on('complete', function() {
  console.log('Fastest is ' + this.filter('fastest').map('name'));
})
// run async
.run({ 'async': true });
