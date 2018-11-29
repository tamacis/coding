



const fs = require('fs');

const file = fs.createReadStream('/tmp/pacman.log');

file.pipe(process.stdout);

console.log('i run fast');

setTimeout(()=>console.log('second'), 2)


