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
// class Employee {
//     constructor() {
//         document.writeln("object created")
//     }
//     display() {
//         document.writeln("<br/>This is employee class function")
//     }    
// }
// let emp1  = new Employee();
// emp1.display();

// object creation with parameter constructor 
// class Employee {
//     id=0;
//     name = ""
//     salary = 0.0;
//     constructor(id,name,salary){
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }
//     displayEmployeeInfo() {
//         document.writeln("<br/> Employee details in display employee function ")
//         document.writeln("<br/> id is "+this.id)
//         document.writeln("<br/> id is "+this.name);
//         document.writeln("<br/> id is "+this.salary);
//     }
// }
// let emp1 = new Employee(100,"Ravi",34000);
// let emp2 = new Employee(101,"Mahesh",36000)
// emp1.displayEmployeeInfo();
// emp2.displayEmployeeInfo();

// object creation with parameter constructor without declaring variable outside constructor  
// with default initialization 
// class Employee {
//     constructor(id=0,name="Unkown",salary=8000){
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }
//     displayEmployeeInfo() {
//         document.writeln("<br/> Employee details in display employee function ")
//         document.writeln("<br/> id is "+this.id)
//         document.writeln("<br/> name is "+this.name);
//         document.writeln("<br/> salary is "+this.salary);
//     }
// }
// let emp1 = new Employee(100,"Ravi",34000);
// let emp2 = new Employee(101,"Mahesh",36000)
// let emp3 = new Employee(102,"Ajay")
// let emp4 = new Employee(103)
// let emp5 = new Employee();
// emp1.displayEmployeeInfo();
// emp2.displayEmployeeInfo();
// emp3.displayEmployeeInfo();
// emp4.displayEmployeeInfo();
// emp5.displayEmployeeInfo();
class Employee {
    constructor(id,name,salary){
    document.writeln("<br/> Employee class constructor")
    this.id = id;
    this.name = name;
    this.salary = salary;
    }
    displayEmployee() {
        document.writeln("<br/>Employee class function")
        document.writeln("<br/> id is "+this.id);
        document.writeln("<br/> name is "+this.name);
        document.writeln("<br/> salary is "+this.salary);    
    }
}
class Manager extends Employee {
    constructor(id,name,salary,numberOfEmp) {
        super(id,name,salary);        // calling super class constructor 
        this.numberOfEmp= numberOfEmp;
    }
    displayManager() {
        document.writeln("<br/> Manager class function")
    }
}
let emp1 = new Employee(1,"Ravi",34000);
emp1.displayEmployee();
let mgr1 = new Manager(2,"Mahesh",36000,10)
mgr1.displayEmployee();
mgr1.displayManager();

