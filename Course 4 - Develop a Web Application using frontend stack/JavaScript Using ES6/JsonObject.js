let emp1 = {id:100,name:"Ravi",salary:45000}   // JS Object 
//let emp1 = '{"id":100,"name":"Ravi","salary":45000}'
document.writeln("<br/>")
document.writeln(emp1)
document.writeln("<br/> Object format ")
document.writeln("<br/> id is "+emp1.id)
document.writeln("<br/> name is "+emp1.name)
document.writeln("<br/> salary is "+emp1.salary)
let empStringFormat = JSON.stringify(emp1); // converting object to string format 
document.writeln("<br/> String format ")
document.writeln("<br/> id is "+empStringFormat.id)
document.writeln("<br/> name is "+empStringFormat.name)
document.writeln("<br/> salary is "+empStringFormat.salary)
let empJson = JSON.parse(empStringFormat)   // converting string to json format 
document.writeln("<br/> JSON format ")
document.writeln("<br/> id is "+empJson.id)
document.writeln("<br/> name is "+empJson.name)
document.writeln("<br/> salary is "+empJson.salary)
console.log(emp1)
console.log(empStringFormat)
console.log(empJson)


