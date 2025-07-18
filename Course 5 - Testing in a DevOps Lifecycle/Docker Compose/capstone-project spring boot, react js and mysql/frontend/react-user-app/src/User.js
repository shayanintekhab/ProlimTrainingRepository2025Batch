import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";

function User() {
let [user,setUser]=useState({"name":""})
let [users,setUsers]=useState([])
let [msg,setMessage]=useState("")
let BASE_URL = "http://localhost:9090/users"
let storeUser= (event)=> {
    event.preventDefault();
    setMessage("");
    axios.post(BASE_URL+"/store",user).then(result=> setMessage(result.data)).catch(error=>setMessage(error.message));
    setUser({name:""})
}
useEffect(()=> {
    axios.get(BASE_URL+"/find").then(result=>{
        setUsers(result.data)
    }).catch(error=>setMessage(error.message));
},[msg])
    return(
        <div>
            <span style={{"color":"red"}}>{msg}</span>
            <h2>User Component</h2>
            <form onSubmit={storeUser}>
                <label>Name</label>
                <input type="text" name="user"
                value={user.name} onChange={(event)=>setUser({...user,"name":event.target.value})}/><br/>
                <input type="submit" value="Store User"/>
                <input type="reset" value="reset"/>
            </form>
            <br/>
            <ol>
            {
                users.map(user=> 
                    <li key={user.id}>{user.name}</li>
                )
            }
            </ol>
        </div>
    )

}

export default User;