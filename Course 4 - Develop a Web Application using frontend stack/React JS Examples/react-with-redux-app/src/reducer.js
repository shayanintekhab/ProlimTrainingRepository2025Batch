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
    if(action.type==="CHANGE_NAME"){
        return {...state,name:"vikash"}   //1st initialState, 2nd property to do change, 3rd value to change 
    }
    if(action.type==="ADD_NUM"){
        //return {...state,num:state.num.append(50)}   //1st initialState, 2nd property to do change, 3rd value to change 
        //return {...state,num:state.num.push(50)}
        return {...state,num:[...state.num,50]}
    }
    if(action.type=="CHANGE_CUSTOMER_AGE"){
//return {...state,customer:{...state.customer,age:state.customer.age+1}} // static age change 
return {...state,customer:{...state.customer,age:action.payload}} // static age change 
    }
return state;
}

export default reducer;