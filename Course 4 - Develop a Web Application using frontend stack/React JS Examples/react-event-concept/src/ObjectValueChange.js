import { useState } from "react";

function ObjectValueChange() {
let [employee,setEmployee]=useState({id:100,name:"Ajay",salary:34000})

let changeAllProperty= ()=> {
    setEmployee({id:101,name:"Vijay",salary:38000})
}
let changeSalary = ()=> {
    //setEmployee({id:101,name:"Vijay",salary:40000})
    //setEmployee({salary:40000})
    setEmployee({...employee,"salary":40000});
    // 1st parameter ...employee hold previous value of all property,
    //2nd parameter, property name which we want to change 
    // 3rd parameter value 
}
    return(
        <div>
            <h2>Employee details</h2>
            <p>Id is {employee.id} name is {employee.name} salary is {employee.salary}</p>
            <input type="button" value="Change all property" onClick={changeAllProperty}/>
            <input type="button" value="Change Salary" onClick={changeSalary}/>
        </div>
    )

}

export default ObjectValueChange;