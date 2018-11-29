extern crate num_cpus;
extern crate rayon;

extern crate scoped_threadpool;
use scoped_threadpool::Pool;

use rayon::prelude::*;

fn chunk_data<'a>(d: &str, n: usize) -> Vec<&str> {
    let len = d.len();
    // println!("{}",len );

    let chunksSize = (len + n - 1) / n; // divide by threads rounded up.
    let mut chunks = Vec::new();
    for t in 0..n {
        let start = t * chunksSize;
        let end = std::cmp::min(start + chunksSize, len);
        chunks.push(&d[start..end]);
        println!("{} {}", start, end)
    }
    chunks
}

// This is the `main` thread
fn main() {
    let cpus = num_cpus::get();
    // println!("You has {} logical cores", cpus);

    // This is our data to process.
    // We will calculate the sum of all digits via a threaded  map-reduce algorithm.
    // Each whitespace separated chunk will be handled in a different thread.
    //
    // TODO: see what happens to the output if you insert spaces!
    let data = "
86967897737416471853297327050364959
11861322575564723963297542624962850
70856234701860851907960690014725639
38397966707106094172783238747669219
52380795257888236525459303330302837
58495327135744041048897885734297812
69920216438980873548808413720956532
16278424637452589860345374828574668";

    // Make a vector to hold the child-threads which we will spawn.
    // let mut children = vec![];

    /*************************************************************************
     * "Map" phase
     *
     * Divide our data into segments, and apply initial processing
     ************************************************************************/

    // split our data into segments for individual calculation
    // each chunk will be a reference (&str) into the actual data
    let chunks = chunk_data(data, cpus);
    // Create a threadpool holding cpu threads
    let mut pool = Pool::new(cpus as u32);

    // Create a vec to hold results:
    let mut results: Vec<u32> = Vec::with_capacity(cpus);

    // pool.scoped(|scoped| {
    //     // Create references to the vector ...
    //     for e in 0..4 {
    //         // ... and add 1 to it in a seperate thread
    //         scoped.execute(|| {
    //             results.push(e);
    //         });
    //     }
    // });

    println!("{:?}", results);

    let result_sum = chunks
        .par_iter()
        .map(|chunk| chunk.chars().filter_map(|c| c.to_digit(10)).sum::<u32>())
        .sum::<u32>();

    println!("The final sum is {}", result_sum);

    /*
    pool.scoped(|scoped| {
        let refs = &mut results;
    for (i, data_segment) in chunks.iter().enumerate() {
        println!("data segment {} is \"{}\"", i, data_segment);
        scoped.execute( move || {
            // Calculate the intermediate sum of this segment:
            let result = data_segment
                        // iterate over the characters of our segment..
                        .chars()
                        // .. convert text-characters to their number value..
                        .map(|c| c.to_digit(10).expect("should be a digit"))
                        // .. and sum the resulting iterator of numbers
                        .sum();

            // println! locks stdout, so no text-interleaving occurs
            println!("processed segment {}, result={}", i, result);

            &results.push(result);
        });
    }
    });

    /*************************************************************************
     * "Reduce" phase
     *
     * Collect our intermediate results, and combine them into a final result
     ************************************************************************/

    // collect each thread's intermediate results into a new Vec
    let mut intermediate_sums = vec![];
    for child in children {
        // collect each child thread's return-value
        let intermediate_sum = child.join().unwrap();
        intermediate_sums.push(intermediate_sum);
    }

    // combine all intermediate sums into a single final sum.
    //
    // we use the "turbofish" ::<> to provide sum() with a type hint.
    //
    // TODO: try without the turbofish, by instead explicitly
    // specifying the type of intermediate_sums
    let final_result: u32 = intermediate_sums.iter().sum();

    println!("Final sum result: {}", final_result);
    */
}
