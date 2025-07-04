import { useState } from "react";
function ProductOperation() {
let [product,setProduct]=useState({pid:"",pname:"",price:"",url:""})

let storeProduct=(event)=> {
    console.log("submit event fired")
    event.preventDefault();         // disable action behaviour of submit button 
    console.log(product)
}

    return(
        <div>
            <h2>Product Operation</h2>
            <form onSubmit={storeProduct}>
                <label>PId</label>
                <input type="text" name="pid" 
                onChange={(event)=>setProduct({...product,"pid":event.target.value})}/> <br/>
                <label>PName</label>
                <input type="text" name="pname" 
                onChange={(event)=>setProduct({...product,"pname":event.target.value})}/> <br/>
                <label>Price</label>
                <input type="text" name="price" 
                onChange={(event)=>setProduct({...product,"price":event.target.value})}/> <br/>
                <label>URL</label>
                <input type="text" name="url" 
                onChange={(event)=>setProduct({...product,"url":event.target.value})}/> <br/>
                <input type="submit" value="Store Product"/>
                <input type="reset" value="reset"/>
            </form>
        </div>
    ) 
}

export default ProductOperation;