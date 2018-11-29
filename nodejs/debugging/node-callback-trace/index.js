

function testFunction(cb) {   

var result = cb();      

}


testFunction(function traceMe() {console.log('called'); return undefined} )
