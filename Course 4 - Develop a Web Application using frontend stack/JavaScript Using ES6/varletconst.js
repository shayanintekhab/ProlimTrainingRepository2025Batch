var a=10;
a=20;
var a=30;           // no error 
console.log(a)
let b=10;
b=20;
//let b=30;             error 
console.log(b)
for(var i=0;i<10000;i++){

}
console.log("Value of i is "+i)
for(let j=0;j<10000;j++){

}
//console.log("Value of j is "+j)
let j=100;
console.log("Value of j is "+j)
const k = 1000;
//k=20000;      we can't assign 