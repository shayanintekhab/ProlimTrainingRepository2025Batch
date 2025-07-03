import { useState } from "react";

function PrimitiveStateVariableComponent() {
let [id,setId]=useState(100);
let [name,setName]=useState("Ravi");
let [salary,setSalary]=useState(23000);
let [result,setResult]=useState(false);

    return(
        <div>
            <h3>Primitive State variable</h3>
<p>Id is {id}, Name is {name} Salary is {salary} Result is {result?"Yes":"No"}</p>
        </div>
    )
}

export default PrimitiveStateVariableComponent;