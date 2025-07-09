import { useDispatch } from "react-redux";

function AddStaticNumValue() {

let dispatch = useDispatch();

let addNumber  = () => {
    dispatch({type:"ADD_NUM"})
}

    return(
        <div>
            <h3>Add New Number</h3>
            <input type="button"
            value="Add Number"
            onClick={addNumber}/>
        </div>
    )
}
export  default AddStaticNumValue;