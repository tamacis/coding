

var promiseWhile = function(condition) {
	return new Promise((resolve, reject) => {
		console.log('this is b ', b)
		var loop = function() {
			if (!condition) {
   console.log('condtion met'); 
   return resolve('this is resolved')
 }
			else {
				console.log(b)
				return Promise.resolve( 
					 b = bye;
					)
				.then(loop)
				.catch(reject('there was an internal error here'))
			}
		};
		process.nextTick(loop) // must do this apparently if not wont loop.
	})
}
var b = 'bye';
promiseWhile(b == 'bye')
