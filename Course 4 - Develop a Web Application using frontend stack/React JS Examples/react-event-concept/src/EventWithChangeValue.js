import { useState } from "react";

function EventWithChangeValue() {
let a=10;                           // local variable 
let [n,setN]=useState(10);          // state variable 

let changeVariableValue = ()=> {
    // a++;        // if we do any change on local variable it doesn't re - render (not display updated value on actual dom)
    // n++;        // if we do any changes on state variable directly it doesn't re-render. 
    // console.log("value of local variable after change "+a)
    // console.log("value of state variable after change "+n)
    setN(n+1);          // we change state variable value using setFunction . not it will re-render 
}
    return(
        <div>
            <h3>Event with local as well as state variable</h3>
            <p>Local variable value is : {a} and state variable value is :{n}</p>
            <input type="button" value="Change value" onClick={changeVariableValue}/>
        </div>
    )
}

export default EventWithChangeValue;