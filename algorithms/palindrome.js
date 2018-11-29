"use strict";
//
function isPalindrome (str) {
let ln = str.length;
let d = (ln % 2 === 0) ? ( ln / 2) : (ln-1)/2 ;

let s  = 0;
let e  = ln - 1;

for ( let i = 0; i< d ;i++ ) {
if (str[s+i] !== str[e-i]) {
return "no palindrome";
break;
}
}
return "palindrome";

}


console.log(
["poop","boop","racecar"].map(isPalindrome)
.join(', '));
