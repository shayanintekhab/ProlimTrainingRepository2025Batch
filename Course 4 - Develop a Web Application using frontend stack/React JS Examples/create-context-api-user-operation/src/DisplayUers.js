import { useContext } from "react";
import UserContext from "./UserContext";

function DisplayUser() {
let contextReference = useContext(UserContext);

return(
    <div>
        <h3>Add Users Details are : </h3>
        <ol>
        {
            contextReference.users.map((user,index)=> 
            <li key={index}>Name : {user.name} Age is {user.age}</li>
            )
        }
        </ol>
    </div>
) 

}

export default DisplayUser;