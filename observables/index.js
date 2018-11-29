// we are gotten 5 items asynchrosuly at some interval, we have to get the sum... 

const EventEmitter = require('events');
class MyEmitter extends EventEmitter {}
const myEmitter = new MyEmitter();
myEmitter.on('event', () => {
	  console.log('an event occurred!');
});
myEmitter.emit('event');

var Observable = require("zen-observable");
Observable.of(1, 2, 3).subscribe(x => console.log(x));
