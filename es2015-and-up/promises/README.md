asyncEachDir (dir: string, fn->Promise<any>) -> Promise<Object{found, sucess, error}>

call the fn for each file in a directory recursively and out of order
the calling function must return a promise, to signal completion 
when all of the operation is complete, 
returns an fulfilled Promise with resolved value of
 
	 found:  Array<files>, - list of files found in the directory 
     sucess: Array<files>, -  list of files for which the fn completed 
     errors: Array<Object{file: <file> ,error: Error}>
         - list of files for which error was thrown either by fs or fn

