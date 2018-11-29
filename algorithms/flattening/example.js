var flattenRecord = require('./flattenRecord');
var data = require('./data');
    
   console.log(JSON.stringify(flattenRecord({}, 'data', data)));    
   console.log('\n')
   console.log(JSON.stringify(flattenRecord({}, 'data', [ 1, { a: 2 }, 3] )));
