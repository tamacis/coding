  

  var BirdPromise = require('bluebird');
  var NativePromise = Promise; 

  NativePromise.resolve(true)
  .then(BirdPromise.reject)
  .catch(console.log);

/*
  NativePromise.resolve(true)
  .then(NativePromise.reject)
  .catch(console.log)

*/

//.catch(console.log);
     
    //p.then(Promise.reject).catch(console.log);   


  /*
   var p= new Promise(function(res,rej) {     res(true); });p.then(Promise.reject).then(null,function(e){console.trace();console.log(e);} );

*/




