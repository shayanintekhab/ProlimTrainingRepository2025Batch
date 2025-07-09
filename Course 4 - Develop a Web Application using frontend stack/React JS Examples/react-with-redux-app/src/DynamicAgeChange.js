import { useState } from "react";
import { useDispatch, useSelector } from "react-redux"

function DynamicAgeChange() {
let gs = useSelector(gs=>gs.customer);       // access global state variable of customer type 
let dispatch = useDispatch();       // it is use to dispatch the action and dynamic value as payload 
let [age,setAge]=useState("");          // local state variable. 
let handleChangeAge= ()=> {
    // 1st parameter with key as action and 2nd parameter key as payload with dynamic age value 
    dispatch({type:"CHANGE_CUSTOMER_AGE",payload:eval(age)})
    setAge("")
}
    return(
        <div>
            <h3>Customer Details</h3>
            <p>Customer Id is {gs.cid} Name is {gs.cname} and Age is {gs.age}</p>
            <input type="text" name="age" value={age} onChange={(event)=>setAge(event.target.value)}/>
            <input type="button" value="Change Age" onClick={handleChangeAge}/>
        </div>
    )
}

export default DynamicAgeChange;