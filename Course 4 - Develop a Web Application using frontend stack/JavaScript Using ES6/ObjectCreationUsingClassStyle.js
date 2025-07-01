// class Employee {
//     id=100;
//     name = "Raj"
//     salary = 12000;

//     displayEmployeeInfo() {
//         document.writeln("<br/> Employee details in display employee function ")
//         document.writeln("<br/> id is "+this.id)
//         document.writeln("<br/> id is "+this.name);
//         document.writeln("<br/> id is "+this.salary);
//     }

// }
// let emp1 = new Employee();
// document.writeln(emp1)
// document.writeln("<br/> Employee Details ")
// document.writeln("<br/> id is "+emp1.id)
// document.writeln("<br/> name is "+emp1.name)
// document.writeln("<br/> salary is "+emp1.salary)
// emp1.displayEmployeeInfo();

// simple empty constructor example 
class Employee {
    constructor() {
        document.writeln("object created")
    }
    display() {
        document.writeln("<br/>This is employee class function")
    }    
}
let emp1  = new Employee();
emp1.display();

