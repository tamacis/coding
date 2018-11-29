
// Prefix ++a
a = 1
b = 10 + ( (() => {a = a + 1; return a }) () )

// Postfix a++
a = 1
b = 10 + ( (() => {tmp = a; a = a + 1; return tmp}) ())

console.log(b)
console.log(a)