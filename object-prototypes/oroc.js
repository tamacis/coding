


var o={prop:0};

((function (a) { console.log(a) })(o));

((new Function("a","{console.log(a)}"))(o))


