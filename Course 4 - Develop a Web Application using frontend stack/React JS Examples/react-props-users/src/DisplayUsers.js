function DisplayUsers(props) {

    return(
        <div>
            <h3>DisplayUsers</h3>
            <ul>
                {
                    props.userDetails.map(
                    (user,index)=>
                        <li key={index}>{user}</li>
                    )
                }
            </ul>
        </div>
    )
}

export default DisplayUsers;