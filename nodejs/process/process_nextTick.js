
console.log('one');
process.nextTick(function() {
console.log('two');
});
console.log('three');
