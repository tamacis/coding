  document.addEventListener("DOMContentLoaded", setupCalculator);

function setupCalculator() {
// Add events binders
genButtons();
}

function genButtons() {
var num_btns=[7,8,9,"C",4,5,6,"/",1,2,3,"*",0,"+","-","="];
btn_holder=getById('btn_holder');
num_btns.forEach(function (btn,i) {
var b=document.createElement('input');
b.setAttribute('type','button');
b.addEventListener("click",function(e) {
userInputs(this.value);
});
b.value=btn;
btn_holder.appendChild(b);
if( (i+1)%4===0) {
btn_holder.appendChild(document.createElement('br'));
}
});

}

function userInputs(input) {
var nums=[0,1,2,3,4,5,6,7,8,9,0];
if(toNum(input) != NaN) {
alert(toNum(input))
updateScreen(input);
}
}

function updateScreen(num) {
getById('calc_screen').value += num;
}

function toNum(str) {
return parseInt(str,10);
}
function getById(id) {
var el = document.getElementById(id);
return el;
}