// simple object creation in function style 
function Employee() {
    this.id =100;           // instance variable 
    this.name = "Ravi";     // instance variable 
    let age = 21;           // it is local variable consider 
    var designation = "Tester"; // it is also local variable consider 
    this.display = function() {             // employee object function 
        document.writeln("<br/>Employee details inside a Employee object")
        document.writeln("<br/> id is "+this.id)
        document.writeln("<br/> name is "+this.name)
        document.writeln("<br/> age is "+age)
        document.writeln("<br/> Designation is "+designation)
    }
}
//Employee();     // now consider as normal function 
let emp1 = new Employee();  // now consider as object 
document.writeln(emp1)
console.log(emp1)
//console.log(Employee)
document.writeln("Employee details")
document.writeln("<br/> id is "+emp1.id)
document.writeln("<br/> name is "+emp1.name)
document.writeln("<br/> age is "+emp1.age)
document.writeln("<br/> Designation is "+emp1.designation)
emp1.display();

