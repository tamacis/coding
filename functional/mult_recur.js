
const multiply = (a, b, p = 0) => {
    if(b < 1) {
        return p
    }
    return multiply(a , b - 1, p + a);
}

console.log(multiply(2,4))
console.log(multiply(5,2))