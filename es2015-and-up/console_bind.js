

var hi="hello";

setTimeout( console.log.bind(console,hi), 4000)
setTimeout( (() => (hi) => console.log(hi))


, 3000) 
