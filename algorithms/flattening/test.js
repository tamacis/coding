var flatten = require('flat');

var data = require('./data');

console.log(flatten([ 1, { a: 2 }, 3]));
console.log('\n')
console.log(flatten(data));
