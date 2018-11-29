var glob = require('glob');
var fs = require('fs');

var request = require('request');

var urls = ['someurl', 'someurl2', 'someurl3'];
var contents = [];

urls.forEach(function (u) {
  contents.push(getContent(u));
});

Promise.all(contents)
  .then(function () {
    // All should be loaded by now
    // Promises values which are resolved are fulfiled, and values can be accessed later 
    contents.forEach(function (promise) {
      var content = Promise.resolve(promise);
      console.log(content); // Promise {'test'} ??
      console.log(typeof content, Object.keys(content));
    });

  }).
  catch(function (err) {
    //handle error
    console.log(err);
  });



function getContent(url) {
  return new Promise(function (resolve, reject) {
    /** commented and stripped out for testing
    request(url, function (err,response, data) {
     if(err) {
      reject(Error(err));
     }
   
   }); **/
    resolve("test");
  });
}