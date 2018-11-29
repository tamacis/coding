const Promise = require('bluebird')

const thing = Promise.coroutine(function*() { return true})
	Promise.coroutine(function *() {
		  for (let i = 0; i < 50000 ; i++) {
			      yield thing()
				        }

		    return yield Promise.resolve(42)
	})().then((r) => console.log('Done', r))
