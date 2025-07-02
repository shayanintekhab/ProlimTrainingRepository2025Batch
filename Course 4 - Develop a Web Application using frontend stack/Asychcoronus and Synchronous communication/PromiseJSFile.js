// ES5 style 
var obj1 = new Promise(function(resolve,reject){
    resolve("Promise full fill")
})

// ES6 style 
let obj2 = new Promise((resolve,reject)=>{
    reject("promise rejected")
})

// to handle the promise 
obj1.then(result=>console.log("Promise resolved in ES5 "+result)).catch(error=>console.log("promise rejected in ES5 "+error))
console.log("1st normal statement")
console.log("2nd normal statement")
obj2.then(result=>console.log("Promise resolved in ES6 "+result)).catch(error=>console.log("promise rejected in ES6 "+error))
console.log("3rd normal statement")