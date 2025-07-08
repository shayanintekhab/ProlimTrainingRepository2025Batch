import { useState } from "react";

function Child2(props) {
    let [user2,setUser2] = useState("ajay@gmail.com");
    return(
        <div style={{"border":"1px solid blue","backgroundColor":"orange","height":"140px"}}>
            <p>User name part of child2 component using in child2 component is <b>{user2}</b></p>
            <p>User name part of parent component using in child2 component is <b>{props.uname}</b></p>
            <h3>Child2 Component</h3>
        </div>
    )
}

export default Child2;  