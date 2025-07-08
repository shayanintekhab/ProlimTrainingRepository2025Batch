import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";
import Child3 from "./Child3";
import MyContext from "./Context";

function Parent() {
let [num,setNum]=useState(100);
    return(
        <MyContext.Provider value={num}>
        <div>
            <h3>Parent Component</h3>
            <p>value of num in Parent component is {num}</p>
            <Child1/>
            <Child2/>
            <Child3/>
        </div>
        </MyContext.Provider>
    )
}

export default Parent;