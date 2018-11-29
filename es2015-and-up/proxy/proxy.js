    "use strict";
    let foo = Proxy.create({
       get(targu,propu,recivu) {
       console.log(targu,propu,recivu);
       }
    }
    );
      
    foo.method = function(param) {
    };