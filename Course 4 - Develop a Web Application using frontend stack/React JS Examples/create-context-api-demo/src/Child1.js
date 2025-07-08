import { useContext } from "react";
import Child4 from "./Child4";
import MyContext from "./Context";

function Child1() {
let numValue = useContext(MyContext)
    return(
        <div>
            <h3>Child1 Component</h3>
            <p>Value of num in Child1 component is {numValue}</p>
            <Child4/>
        </div>
    )
}

export default Child1;