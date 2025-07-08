import { useContext } from "react";
import MyContext from "./Context";

function Child10() {
    let numValue = useContext(MyContext) 
    return(
        <div>
            <h3>Child10 Component</h3>
            <p>Value of num is in Child10 component is {numValue}</p>
        </div>
    )
}

export default Child10;