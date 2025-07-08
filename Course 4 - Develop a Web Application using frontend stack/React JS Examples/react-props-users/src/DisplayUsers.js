function DisplayUsers(props) {

let deleteUser = (user)=> {
    //alert(user)
    props.onDeleteUser(user);       // passing user name to parent component using props with onDeleteUser functions 
}
    return(
        <div>
            <h3>DisplayUsers</h3>
            <ul>
                {
                    props.userDetails.map(
                    (user,index)=>
                        <li key={index}>
                            {user}
                        <input type="radio" name="deleteUser"
                        onClick={()=>deleteUser(user)}
                        />Delete    
                        </li>
                    )
                }
            </ul>
        </div>
    )
}

export default DisplayUsers;