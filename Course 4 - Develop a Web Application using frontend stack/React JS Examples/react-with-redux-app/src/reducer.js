import { act } from "react";

let initialState = {
    n:100,
    name:"Akash",
    num:[10,20,30,40],
    customer : {cid:100,cname:"John",age:34}
}

function reducer(state=initialState,action){
// base upon action we can do the change on state variable. 
    console.log("In reducer ")
    console.log(action)
    if(action.type==="INCREMENT"){
        return {...state,n:state.n+1}   //1st initialState, 2nd property to do change, 3rd value to change 
    }

return state;
}

export default reducer;