function SimpleEventComponent() {

let handleClickEvent=()=> {
    console.log("handle event with external function")
}

    return(
        <div>
        <input type="button" value="Inline function with event" 
        onClick={()=>console.log("handle event with internal function")}/>
        
        <input type="button" value="external function with event"
        onClick={handleClickEvent}/>
        </div>
    )
}

export default SimpleEventComponent;