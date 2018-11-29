

  Promise.resolve(true)
  .then(function(f) {

  throw new Error(f);
})
  .catch(function (e) {
   console.log(typeof e); console.log(Object.getOwnPropertyNames(e));
   console.log(e.stack);
});

  process.on('uncaughtExecption', function (e) {
console.log(e);
});



