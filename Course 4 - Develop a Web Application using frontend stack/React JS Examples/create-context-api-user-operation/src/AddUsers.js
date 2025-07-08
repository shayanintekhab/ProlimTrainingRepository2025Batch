import { useContext, useState } from "react";
import UserContext from "./UserContext";

function AddUsers() {
let [user,setUser] = useState({"name":"",age:""})

let contextReference = useContext(UserContext);

let addUser = (event)=> {
    event.preventDefault();
    //console.log("User added:", user);
    contextReference.dispatchUser("ADD_USER",user); // Dispatching the action to add user
    setUser({"name":"",age:""});
}
    return(
        <>
        <h3>Add Users</h3>
        <form onSubmit={addUser}>
            <label>Name</label>
            <input type="text" value={user.name}
            onChange={(event)=>setUser({...user,name:event.target.value})}/><br/>
            <label>Age</label>
            <input type="text" value={user.age}
            onChange={(event)=>setUser({...user,age:event.target.value})}/><br/>
            <input type="submit" value="Add User"/>
            <input type="reset" value="reset" onClick={()=>setUser({"name":"",age:""})}/>
        </form>
        </>
    )
}

export default AddUsers;