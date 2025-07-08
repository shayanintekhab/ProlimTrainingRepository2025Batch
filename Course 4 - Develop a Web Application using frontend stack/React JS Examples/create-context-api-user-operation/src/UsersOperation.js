import { useState } from "react";
import AddUsers from "./AddUsers";
import UserContext from "./UserContext";
import DisplayUser from "./DisplayUers";

function UsersOperation() {
let [users,setUsers]=useState([]);

let dispatchUser = (action,payload)=> {
    console.log("In User Operation component")
    console.log("Action:", action, "Payload:", payload);
    
    if(action === "ADD_USER") {
        setUsers([...users,payload]); // Adding the new user to the existing users array
    }

    
}
    return(
        <UserContext.Provider value={{users,dispatchUser}}>
        <div>
        <h2>Users Operations </h2>
        <hr/>
        <AddUsers/>
        <hr/>
        <DisplayUser/>
        </div>
        </UserContext.Provider>
    )

}

export default UsersOperation;