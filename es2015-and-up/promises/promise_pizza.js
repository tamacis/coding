  
   var pf = Promise.resolve("fulfill");
   var pr = Promise.reject("broken");

/*
   var pp = new Promise(function(ro,rx) { 
        var phang=0;
            setTimeout(function(){ro(1);},300); 
setTimeout(function(){ rx(-1); },296); 

}); */

   console.log(pf); 
   console.log(pr);
   pf.then(console.log).then(pr).catch(console.log);
pf.then(pr).then(console.log).catch(console.log);

   /*
Just return the promise. Thats it.
Promises arent anything special. Theyre just objects. So you can just pass them around like you would do pass any other objects. Perhaps what makes them special is because of Promise.prototype.then, which isnt all that special until you start calling it with  types of arguments.

Yes, call. that reminds me of callbacks, .then is a callback too. What no? 


     function iAmAsync(arghhs,callback) {
      // i am async, i could be doing an io, querying an database, or just waiting for my  pizza
      // But this time I will just do what everyone else do, the foo
       callback("foo");
      }

      iAmAsync(undefined,function(futureValue) {
      console.log(futureValue);
      });

//Now, lets do that like this, old school

   purrmeows =   (function () { 
        
        purrmeows=function(func) {
         this.f=func;
         purrmeows.resolveValue = function() {
         return purrmeows.prototype.f(purrmeows.getValue);
        }
        purrmeows.getValue =function (value) {
     return value;
        }
        }

        purrmeows.prototype.then = function (f) {
        f(purrmeows.resolveValue()) 
        }
      return purrmeows;
      })();

 function iAmAsyncPurrmiss(arghhs) {
      // i am async, i could be doing an io, querying an database, or just waiting for my  pizza
      // But this time I will just do what everyone else do, the foo
       return new purrmeows( function (resolve) {
  resolve("foo");
});
      }

iAmAsyncPurrmiss().then(function(v) {
console.log(v) 
});

       
      




     
         function getCont(url) {
            return new Promise(function (resolve ,reject) {
        // The real code makes request and resolves to response body or rejects with error
         resolve("response body");
            });
      }

         function saveFile  (path,data) {
           return new Promise(function (resolve ,reject) {
         // The real code saves file and resolves to true for success or rejects for error
         resolve(true);
            });
          }


         saveCont("some://url","/some/path").then ( function() {
      console.log('x');
         });

         saveCont("another://url","/another/path").then ( function() {
     // Do another thing
          console.log('x');
         });


        function saveCont(url,path) {
         return getCont(url)
        .then(function(data)        {saveFile(path,data)}) ;
         };

*/