import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";

function Parent() {
let [user,setUser] = useState("admin@gmail.com");
    return(
        <div style={{"border":"1px solid red","backgroundColor":"lightgray","height":"350px"}}>
            <h2>Parent Component</h2>
            <p>User name part of parent component using in parent component is <b>{user}</b></p>
            <Child1 name={user}></Child1>
            <Child2 uname={user}></Child2>

        </div>
    )
}

export default Parent;