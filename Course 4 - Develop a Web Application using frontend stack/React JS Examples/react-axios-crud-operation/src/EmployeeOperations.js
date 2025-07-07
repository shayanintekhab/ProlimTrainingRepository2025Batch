import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";

function EmployeeOperation() {
let URL  = "http://localhost:3000/employees";
let [employees,setEmployees] = useState([]);        // array of employees to hold multiple employee data
let [employee,setEmployee]=useState({name:"",salary:""});        // employee object to hold single employee data
useEffect(()=> {
    axios.get(URL)
        .then(result => setEmployees(result.data))
        .catch(err => console.log(err));
},[employee])

let addEmployee = (event)=> {
    event.preventDefault();
    console.log("Adding Employee", employee);
    // 1st parameter is URL, 2nd parameter data in json format. 
    axios.post(URL,employee).then(result=>{
        console.log(result)
    }).catch(error=> {
        console.log(error);
    })
    setEmployee({name:"",salary:""});

}
    return(
        <div>
            <h2>Employee Management System</h2>
            <form onSubmit={addEmployee}>
                <label>Name</label>
                <input type="text" name="name" value={employee.name} 
                onChange={(e) => setEmployee({...employee, name: e.target.value})} /><br/>
                <label>Salary</label>
                <input type="text" name="salary" value={employee.salary} 
                onChange={(e) => setEmployee({...employee, salary: e.target.value})} /><br/>
                <input type="submit" value="Add Employee"/>
                <input type="reset" value="Reset Form" onClick={() => setEmployee({name:"",salary:""})} />
            </form>
            {
                employees.length>0 ?
                <div>
                        <h3>Number of employee are {employees.length}</h3>
                        <table border="1">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Salary</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    employees.map((emp) => (
                                        <tr key={emp.id}>
                                            <td>{emp.id}</td>
                                            <td>{emp.name}</td>
                                            <td>{emp.salary}</td>
                                        </tr>
                                    ))
                                }
                            </tbody>
                            </table>
                </div>    :
                <div>
                    <h3>No Employees Found</h3> 
                </div>
            }
        </div>
    )
}

export default EmployeeOperation;