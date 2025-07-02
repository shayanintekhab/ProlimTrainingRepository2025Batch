console.log("Synchronous communication")
console.log("1st Statement")
console.log("2nd Statement")
console.log("3rd Statement")

console.log("----------------------------------")

console.log("Asynchronous communication")
console.log("1st Statement")
setTimeout(()=> {
    console.log("2nd Statement")
},2000)
console.log("3rd Statement")
setInterval(() => {
    console.log("4th statement")
}, 500);