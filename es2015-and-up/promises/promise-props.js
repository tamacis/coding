

     var Promise= require('bluebird');
 
      Promise.props({
     "wrapper1" : someasync(1).reflect(),
     "wrapper2" : someasync(0).reflect(),
     "wrapper3" : someasync(1).reflect()
      })
      .then ( function (results) {
      Object.keys(results).forEach(function (key) {
       if(results[key].isRejected()) {
        console.log(key + "  failed.",results[key].reason()) ;
        }
        else {
        console.log(key + " successed", results[key].value());

        }
      });
      });


       function someasync(t) {
        if(t===0) { return Promise.reject('some err');}
       else {return Promise.resolve(true);}
       };