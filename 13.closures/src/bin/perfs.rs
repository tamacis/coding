fn main() {
    let coefficients: [i64; 12];
    let qlp_shift: i16;

    let buffer: &mut [i32] = &mut [10, 30, 40, 50, 19, 30, 10, 31, 13, 310, 310, 130];
    coefficients = [2, 4, 5, 6, 7, 8, 10, 12, 13, 45, 62, 23];
    qlp_shift = 16;

    for i in 12..buffer.len() {
        let prediction = coefficients
            .iter()
            .zip(&buffer[i - 12..i])
            .map(|(&c, &s)| c * s as i64)
            .sum::<i64>() >> qlp_shift;
        let delta = buffer[i];
        buffer[i] = prediction as i32 + delta;
    }

    buffer.iter().for_each(|x| print!("{} ", x));
    println!("");
}
