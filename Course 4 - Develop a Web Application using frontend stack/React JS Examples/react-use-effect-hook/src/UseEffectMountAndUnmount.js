import { useEffect, useState } from "react";
//let Hello = ()=><h2>This is Hello Component</h2>
function Hello() {

useEffect(()=> {
    console.log("Hello Component Mounted");     // when component added in actual DOM

    return ()=>console.log("Hello Component Unmounted");    // when component removed from actual DOM
},[])

    return(
        <div>
            <h2>This is Hello Component</h2>
        </div>
    )
}
let Bye = ()=><h2>This is Bye Component</h2>

function UseEffectMontAndUnmount() {
let [flag,setFlag]=useState(false);
    return(
        <div>
            <h2>UseEffect Mount and UnMount</h2>
            <input type="button" value="Mount Hello Component" onClick={()=>setFlag(!flag)}/>
            {flag ? <Hello/> : <Bye/>}
        </div>
    )
}   

export default UseEffectMontAndUnmount;