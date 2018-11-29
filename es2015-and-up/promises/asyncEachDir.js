
import Promise from 'bluebird';
import * as fs from 'fs' ;
import * as path from 'path';

Promise.promisifyAll(fs);

// unused - 
class File {
 constructor ( path, promise) {
   Object.assign(this, {path, promise});
 }
}



export default function( dir, fn, concurrency=Infinity) {

	const readDir = (directory) => fs.readdirAsync( directory )
		.map( entries => {
			const entry = path.join( directory, entries );
			
             return fs.statAsync( entry )
                      .then( stat => {
                        if(stat.isDirectory()) { 
                      		return readDir( entry); 
                      	 }
                    });
         })
		.reduce((a,b)=> a.concat(b), []);

   return readDir(dir).then(()=> dirents.map(fn, {concurrency}));;
   
}

