import { useState } from "react";

function ArrayStateVariable() {
let [names,setName]=useState(["Ravi","Ramesh","Raj","Ram","Raju","Ravi"]);
    return(
        <div>
            <h2>Array State variable</h2>
            <p>All Names {names}</p>
            <hr/>
            <h2>All Names one by one</h2>
            {
            names.map((name,index)=>
                <div key={index}> {index+1}) {name}</div>)
            }
        </div>
    )
}

export default ArrayStateVariable;