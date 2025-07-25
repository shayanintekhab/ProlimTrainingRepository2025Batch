import { useState } from "react";

function Child1(props) {
let [user1,setUser1] = useState("ravi@gmail.com");
    return(
        <div style={{"border":"1px solid red","backgroundColor":"yellow","height":"200px"}}>
            <p>User name part of child1 component using in child1 component is <b>{user1}</b></p>
            <p>User name part of parent component using in child1 component is <b>{props.name}</b></p>
            <p>User name part of child2 component using in child1 component is <b>{props.child2Value}</b></p>
            <h3>Child1 Component</h3>
            {props.passValueToParent(user1)}
        </div>
    )
}

export default Child1;