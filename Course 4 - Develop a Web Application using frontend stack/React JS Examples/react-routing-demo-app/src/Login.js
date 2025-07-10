import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Login() {
let [login,setLogin]=useState({emailId:"",password:""})
let navigate = useNavigate();
let handleLogin = (event)=> {
    event.preventDefault();
    //console.log(login);
    // login details we need to pass to backend technologies or we can check from json file with help of axios tools. 
    if(login.emailId==="admin@gmail.com" && login.password==="admin@123"){
            alert("successfully login")
            navigate("/home");
    }else {
            alert("failure try once again")
    }
    setLogin({emailId:"",password:""});
}
    return(
        <div>
            <h2>Login page</h2>
            <form onSubmit={handleLogin}>
                <label>EmailId</label>
                <input type="email" name="emailId"
                value={login.emailId} onChange={((event)=>setLogin({...login,emailId:event.target.value}))}/><br/>

                <label>Password</label>
                <input type="password" name="password"
                value={login.password} onChange={((event)=>setLogin({...login,password:event.target.value}))}/><br/>

                <input type="submit" value="SignIn"/>
                <input type="reset" value="reset"/>
            </form>
        </div>
    )
}

export default Login;