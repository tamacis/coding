/* nextline 
getting the next line of a file using streams and generators

*/

    "use strict";
    var fs=require('fs');
    var Stream = require('stream');
    var StringDecoder = require('string_decoder').StringDecoder;

    class ReadLine extends Stream.Transform {
    constructor (readableSource) {
    
    super({readableObjectMode:true});

    // internal stuffs
    this._buffer = "";
    this._decoder = new StringDecoder('utf8');
    
    //  promise for callback
    this._readyPrms = () => {
    return new Promise ( ((o, x) => {
     this.on('data',o) ;
     }).bind(this));
     };
     
     // file
     readableSource.pipe(this);   
    }
    
    _transform (chunk,enc,done) {
    let linebreak = /\n/;
    this._buffer += this._decoder.write(chunk);
    var lines = this._buffer.split(linebreak);
    this._buffer = lines.pop();
    
    let  _lineGen = (function*() {
      for(let line of lines) {
       yield line;
     }
    });
    
    
    this._lineNext = _lineGen();
    
    //  signal an data  event for the promise to resolve, 
    // todo : end the stream when no next lines, even though this wont be used for reading.. and also do some _flush :\
    this.push("ready");
    }
    
    ready (cb) {
    // callback
    // should catch maybe
    return this._readyPrms().then(cb);
    }
    
    
    nextLine () {
    // returns next line
    return this._lineNext.next().value;
    }

    }

    
    // a unit test :S
    var file = fs.createReadStream("nextline.js");
    
    var liner = new ReadLine(file);
    
    liner.ready( ()=> {
    console.log(liner.nextLine());
    console.log(liner.nextLine());
    })
      