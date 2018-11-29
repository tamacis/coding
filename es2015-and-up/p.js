
     
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
     // Do one thing
         });

         saveCont("another://url","/another/path").then ( function() {
     // Do another thing
         });


        function saveCont(url,path) {
        getCont(url)
        .then(function(content) {
saveFile(path,data) })
        .then( function() {
    // **  What to put here? **
    
         });
         };