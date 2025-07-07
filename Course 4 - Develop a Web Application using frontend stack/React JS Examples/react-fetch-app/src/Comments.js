import { useState } from "react";

function Comments() {
let [comments,setComments]=useState([]);

let loadAllComments = ()=> {
    // fetch("https://dummyjson.com/comments").
    // then(response=>response.json()).
    // then(result=>console.log(result.comments)).
    // catch(error=>console.log(error));

    fetch("https://dummyjson.com/comments").
    then(response=>response.json()).
    then(result=>setComments(result.comments)).
    catch(error=>console.log(error));
}
    return(
        <div>
            <h2>Comments Details</h2>
            <input type="button" value="Load Comments" onClick={loadAllComments}></input>
            <ul>
                {comments.map(comment=>
                    <li key={comment.id}>
                        <h3>{comment.name}</h3>
                        <p>{comment.body}</p>
                        <p><strong>Email:</strong> {comment.email}</p>
                        <p><strong>Post ID:</strong> {comment.postId}</p>
                        <p><strong>User Name:{comment.user.username}</strong> Full Name{comment.user.fullName}</p>
                    </li>
                )}
            </ul>
            </div>
    )
}
export default Comments;