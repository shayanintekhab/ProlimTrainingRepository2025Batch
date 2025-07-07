import { useEffect, useState } from "react";

function SimpleUseEffectDemo() {
let [count,setCount]=useState(100);
let [n,setN]=useState(0);
let loadFunction=() =>{
    console.log("load function called.")
}
//loadFunction(); // calling the function directly

// 1st example of useEffect hook
// it call once when the component is loaded, again it call when component rendered
// useEffect(()=> {
//     console.log("useEffect hook called. when component is loaded and rendered.");
// });

// 2nd example of useEffect hook
// it call once when the component is loaded, it will not call when component rendered
// useEffect(()=> {
//     console.log("useEffect hook called. Only once when component is loaded.");
// },[]);      // no dependency array, so it will not call again when component rendered

// 3rd example of useEffect hook
// it call once when the component is loaded,
useEffect(()=> {
    console.log("useEffect hook called. it will call when count value is changed.");
},[count]);      // when count value is changed, it will call again

    return(
        <div>
            <h3>UseEffect Example</h3>
            <input type="button" value="Load Function" onClick={loadFunction}/>
            <br/>
        <input type="button" value="Change Count value" onClick={()=>setCount(count+1)}/><br/>
        <input type="button" value="Change N value" onClick={()=>setN(n+1)}/>
            <hr/>
            <p>Count value is : {count} and value of n is : {n}</p>
        </div>
    )
}

export default SimpleUseEffectDemo;