    function one() {
    var x = 0;
    console.log('started');
    return new Promise(function(res,rej) {
     setTimeout(function() {
     x = 1;
     res(x);
     },500);
    });
    }
    
    function two(fval) {
    console.log('finished: x is ' + fval );
    }
    
    one().then(two);