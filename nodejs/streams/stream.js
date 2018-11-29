

"use strict";

     let fs=require('fs');
     let filePaths=['./tmp/h.txt','./tmp/s.txt'];


     let Stream = require('stream');
     
      class MyStream extends Stream.Transform {
         constructor (dest,end_cb) {
         super();
          if(end_cb) {
           dest.write('bye'); 
           dest.end();
           end_cb(dest);
          }
         this.on('finish',function() {
         //when process done;
         dest.write('hello');
         });
         } 
          
         _transform(chunk,enc, transformed) {
         // extract data,here..
         let data=chunk.toString();
        data=data.substring(0,data.length-2);
         this.push(data);
         transformed();
         }

         _flush(flushed) {
         this.push('\n');
         flushed();
         }
         
      
       
      }
   

    let combined_stream = new MyStream();
     
     let last=filePaths.length;
     filePaths.forEach(function (fpath,i) {
     let fstream = fs.createReadStream(fpath);
     
     var flag = (i===last)?consumeStream:false
     var myStream= new MyStream(combined_stream,flag);
     fstream.pipe(myStream);
    });
      

   function consumeStream(stream) {
     // Consume the combines stream
     stream.pipe(process.stdout);
}
      
     
       
    
/*.then(function (stream) {
     //Heres the combined stream;
     stream.pipe(process.stdout);
});*/
     

     
    