  
   var 
  
   function *syncCode() {
     
   }


  
  function asyncPlaceholder(ret,fate,date) {
   return new Promise (res,rej) {
      setTimeout(function {
        if (fate===1) {
           res(ret);
        }
        else {
           rej(fate);
        }
      )},date);
   });
  };
  