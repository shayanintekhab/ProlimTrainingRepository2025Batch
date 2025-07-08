import { useContext } from "react";
import MyContext from "./Context";

function Child7() {
let numValue = useContext(MyContext) 
    return(
        <div>
            <h3>Child7 Component</h3>
            <p>Value of num in Child7 component is {numValue}</p>
        </div>
    )
}

export default Child7;