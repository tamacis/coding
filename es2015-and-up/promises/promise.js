
const Promise = require('bluebird');
const fs = require('fs');
const path = require('path');

Promise.promisifyAll(fs);

uploadDir('./node_modules/').then(file=> {
//console.log(JSON.stringify(file, null,2))
});

//uploadDir('/home/half/projs').then(file=> {console.log(JSON.stringify(file, null,2))});


function uploadDir( directory ) {
	return fs.readdirAsync( directory )
		.map( entries => {
			const entry = path.join( directory, entries );
             return fs.statAsync( entry )
                      .then( stat => {
                        if(stat.isDirectory()) { 
                      		uploadDir( entry ) 
                      	 }
                      	console.log( entry );
                    });
            });
}

// asyncEachDir (string, fn->Promise<any>) -> Promise<Object{found, sucess, error}>
// call the fn for each file in a directory recursively and out of order
// the calling function must return a promise, to signal completetion 
// when the operation is complete, returns an fulfilled Promise with resolved value of
//  
//	 found:  Array<files>, - list of files found in the directory 
//   sucess: Array<files>, -  list of files for which the fn completed 
//   errors: Array<Object{file: <file> ,error: Error}>
//          - list of files for which error was thrown either by fs or fn
// 



function uploadDirOliver( directory ) {
	return fs.readdirAsync( directory )
		.map( entry => path.join( directory, entry ) )
		.map( entry => Promise.join( entry, fs.statAsync( entry ), ( entry, stat ) => ( {
			file : entry,
			stat : stat
		} ) ) )
		.map( entry => {
			if( entry.stat.isDirectory() ) {
				return uploadDirOliver( entry.file );
			}
			console.log( entry.file );
		} );
}


function readDir(dirName) {
    return fs.readdirAsync(dirName).map(function (fileName) {
        var Path = path.join(dirName, fileName);
        return fs.statAsync(Path ).then(function(stat) {
            return stat.isDirectory() ? readDir(Path ) : Path ;
        });
    }).reduce(function (a, b) {
        return a.concat(b);
    }, [])
 //   .map(file=> {console.log(file)})
}