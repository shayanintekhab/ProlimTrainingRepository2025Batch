import { useState } from "react";
import DisplayUsers from "./DisplayUsers";
function Users() {
let [name,setName]=useState("")
let [users,setUsers]=useState([])
let addUser= ()=> {
    setUsers([...users,name])   // add the new user to the users array
    setName("");        // clear the input field after adding a user
}
    return(
        <div>
            <h2>Add Users</h2>
            <input type="text" value={name}
            onChange={(event)=>setName(event.target.value)}
            placeholder="Enter Name" />
            
            <input type="button" value="Add User"
            onClick={addUser}/>
            <hr/>
            <DisplayUsers userDetails={users}/>
        </div>
    )
}

export default Users;