// require the EventEmitter from the events module
const EventEmitter = require('events').EventEmitter

// create an instance of the EventEmitter object
const eventEmitter = new EventEmitter()

// register a listener for the 'randomString' event
eventEmitter.on('randomString', function (randomStr) {
setImmediate(() =>
  console.log('Received the string: ' + randomStr)
);
})

eventEmitter.on('randomString', function (randomStr) {
  console.log('Listener 2 received: ' + randomStr)
})


// trigger an event called 'randomString' and send
// a randomly selected string to the listeners
eventEmitter.emit('randomString', randomString())

// simple function to randomly select a string from an array
function randomString () {
  const stringsArr = ['NodeJs', 'coligo.io', 'JavaScript', 'EventEmitters']
  return stringsArr[Math.floor(Math.random() * stringsArr.length)]
}



