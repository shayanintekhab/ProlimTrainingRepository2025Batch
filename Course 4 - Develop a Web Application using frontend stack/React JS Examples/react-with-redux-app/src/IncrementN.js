import { useDispatch } from "react-redux";

function IncrementN() {

let dispatch = useDispatch();

let handleIncrement = () => {
    //dispatch();       // dispatch without action 
    dispatch({type:"INCREMENT"})    // action type is increment. it call reducer function  
}
    return(
        <div>
            <h3>Increment n global state variable</h3>
        <input type="button" value="Increment n variable"
        onClick={handleIncrement}/>
        </div>
    )
}
export default IncrementN;