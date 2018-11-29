/* nextline
getting the next line of a file using streams and generators
transpiled with babel - l es6.arrowFunctions
runs on iojs-2.5+ with no extra harmony flags
*/

"use strict";
var fs = require('fs');
var Stream = require('stream');
var StringDecoder = require('string_decoder').StringDecoder;

class ReadLine extends Stream.Transform {
  constructor(readableSource) {

    super({ readableObjectMode: true });

    // internal stuffs
    this._buffer = "";
    this._decoder = new StringDecoder('utf8');

    //  promise for callback
    this._readyPrms = function () {
      return new Promise(function (o, x) {
       this.on('data', o);
      }.bind(this));
    };

    // file
    readableSource.pipe(this);
  }

  _transform(chunk, enc, done) {
    let linebreak = /\n/;
    this._buffer += this._decoder.write(chunk);
    var lines = this._buffer.split(linebreak);
    this._buffer = lines.pop();

    let _lineGen = function* () {
      for (let line of lines) {
        yield line;
      }
    };

    this._lineNext = _lineGen();

    //  signal an data  event for the promise to resolve,
    //should probably end the stream when all done, even though this wont be used for reading..
    this.push("ready");
  }

  ready(cb) {
    // callback
    // should catch maybe
    return this._readyPrms().then(cb);
  }

  nextLine() {
    // returns next line
    return this._lineNext.next().value;
  }

}

    // a unit test :S
    var file = fs.createReadStream("nextline.js");

    var liner = new ReadLine(file);

    liner.ready(function () {
      console.log(liner.nextLine());
      console.log(liner.nextLine());
    });

