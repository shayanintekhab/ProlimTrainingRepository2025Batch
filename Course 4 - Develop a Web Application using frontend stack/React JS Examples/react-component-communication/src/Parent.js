import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";

function Parent(props) {
let [user,setUser] = useState("admin@gmail.com");
let [child1Value,setChild1Value] = useState("");
let [child2Value,setChild2Value] = useState("");
let receiveChild1Value= (value)=> {
    //console.log("Value received from child1 component is "+value);
    setChild1Value(value)
}
let receiveChild2Value= (value)=> {
    //console.log("Value received from child1 component is "+value);
    setChild2Value(value)
}
    return(
        <div style={{"border":"1px solid red","backgroundColor":"lightgray","height":"550px"}}>
            <h2>{props.msg}</h2>
            <h2>Parent Component</h2>
            <p>User name part of parent component using in parent component is <b>{user}</b></p>
            <p>User name part of child1 component using in parent component is <b>{child1Value}</b></p>
            <p>User name part of child2 component using in parent component is <b>{child2Value}</b></p>
            <Child1 name={user} passValueToParent={receiveChild1Value} child2Value={child2Value}></Child1>
        <hr/>
            <Child2 uname={user} sendValueToParent={receiveChild2Value} child1Value={child1Value}></Child2>

        </div>
    )
}

export default Parent;