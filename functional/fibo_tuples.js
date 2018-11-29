function fibo_tuples(n, [p, q]) {
  if (n <= 1) {
    return [p, q];
  } else {
    return fibo_tuples(n - 1, [p + q, p + q + q]);
  }
}

let range = (start, stop, step = 1) =>
  Array(stop - start)
    .fill(start)
    .map((x, y) => x + y * step);

for (let i of range(1, 6)) {
  console.log(fibo_tuples(i, [1, 1]));
}
