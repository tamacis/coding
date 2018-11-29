// examples 

import asyncEachDir from './asyncEachDir.js';
import Promise from 'bluebird';

const uploadFile = (file) =>  {
return Promise.delay(1000);
};

asyncEachDir('./node_modules/bluebird', (file)=> {
console.log(`Uploading file ${file}`);
const uploads = [];
uploads.push(uploadFile(file).then(()=> console.log('Uploaded ' + file)));
return Promise.all(uploads);
}, 4)
.then(()=> console.log('Finished all.'))