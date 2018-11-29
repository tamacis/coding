function sum(num){
    if (num === 0) {
        return 0;
    } else {
        return num + sum(--num)
    }
}

function sum_loop(num) {
    let s = 0;
    for (let i = 1; i<= num; ++i) {
        s += i;
    }
    return s;
}

console.log(sum(5))    
console.log(sum_loop(5))    