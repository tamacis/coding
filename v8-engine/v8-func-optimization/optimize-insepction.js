//Function that contains the pattern to be inspected (using an `eval` statement)

var counter = 0;
var incr = (c)=>c+1;
function exampleFunction() {
while(counter < 100) (()=>{ ++counter; })();
}

function printStatus(fn) {
    switch(%GetOptimizationStatus(fn)) {
        case 1: console.log("Function is optimized"); break;
        case 2: console.log("Function is not optimized"); break;
        case 3: console.log("Function is always optimized"); break;
        case 4: console.log("Function is never optimized"); break;
        case 6: console.log("Function is maybe deoptimized"); break;
        case 7: console.log("Function is optimized by TurboFan"); break;
        default: console.log("Unknown optimization status"); break;
    }
}

//Fill type-info
exampleFunction();
// 2 calls are needed to go from uninitialized -> pre-monomorphic -> monomorphic
exampleFunction();

%OptimizeFunctionOnNextCall(exampleFunction);
//The next call
exampleFunction();

//Check
printStatus(exampleFunction);
