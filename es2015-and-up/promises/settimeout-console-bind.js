

var hi="hello";

setTimeout( console.log.bind(console,hi), 1000)
Promise.resolve(hi).then(console.log);
