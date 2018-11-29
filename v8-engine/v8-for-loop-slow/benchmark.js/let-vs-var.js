
var Benchmark = require('benchmark');

var suite = new Benchmark.Suite;

suite.add('#1 for loop with let', function() {
for(let i=0; i < 1e6; i++);
})
.add('#2 for loop with var', function() {
for(var i=0; i < 1e6; i++);
})

.on('cycle', function(event) {
  console.log(String(event.target) + '\n');
})
.on('complete', function() {
  console.log('Fastest is ' + this.filter('fastest').map('name'));
})
// run async
.run({ 'async': true });
