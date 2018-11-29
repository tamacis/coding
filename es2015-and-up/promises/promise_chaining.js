
     
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
          console.log('y');
         });


        function saveCont(url,path) {
         return getCont(url)
        .then(function(data) {saveFile(path,data)}) ;
         };