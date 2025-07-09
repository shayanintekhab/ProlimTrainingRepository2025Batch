import { useState } from "react";
import { useSelector } from "react-redux";

function SecondComponent() {
let [fname,setFName]=useState("Vikash");
let gs = useSelector(gs=>gs)
    return(
        <div>
            <h3>Second Component</h3>
            <p>FName is local state variable {fname}</p>
            <p>Global State variable n value is {gs.n} 
                Name is {gs.name}
                <br/>
                Number array is {gs.num.map((n,i)=><span key={i}>{n} </span>)}
                <br/>
                Customer name is {gs.customer.cname}
                <br/>
            </p>
        </div>
    )
}
export default SecondComponent;