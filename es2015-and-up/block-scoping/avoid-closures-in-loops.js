

for (var i=0; i<3; ++i) {
setTimeout(function() {
console.log(` closure derp ${i}`)
},500);
}

for (let j=0; j<3; ++j) {
setTimeout(function() {
console.log(` closure let ${j}`)
},500);
}

let k=0;
for (; k<3; ++k) {
const l = k;
setTimeout(function() {
console.log(` closure const insdie ${l}`)
},500);
}
