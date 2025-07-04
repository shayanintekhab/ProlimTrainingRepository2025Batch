import { useState } from "react";

function ArrayVariableChange() {

let [technologies,setTechnologies]=useState(["Java","Python"]); // array state variable 
let [technology,setTechnology]=useState("");

// by default every function which generated with react event. they take first parameter as event object. 
let handleOnChangeEvent=(event)=> {
    //console.log("event fired")
    //console.log(event);         // event object details 
    //console.log(event.target)       // it provide that specific tag details. 
   // console.log(event.target.name+" "+event.target.value);      // it provide name attribute and value 
   setTechnology(event.target.value);           // set the dynamic value in technology state variable. 
}
let addTechnology=(event)=> {
    console.log(technology)
    //technologies.push(technology);          // it didn't re-render 
    //setTechnologies(technology)                   // using spread operator 
    setTechnologies([...technologies,technology]);   // 1st ...technologies hold previous data, 2nd parameter value append thedata 
    //console.log(technologies);
    setTechnology("");          // re-set 
}
    return(
        <div>
<input type="text" name="technology" onChange={handleOnChangeEvent} placeholder="Write technology name" value={technology}/>
        <input type="button" value="Add Technology" onClick={addTechnology}/>
        <h3>All Technologies details</h3>
        <ul>
            {
            technologies.map((technology,index)=>
                    <li key={index}>{technology}</li>
            )}
        </ul>
        </div>
    )
}

export default ArrayVariableChange;