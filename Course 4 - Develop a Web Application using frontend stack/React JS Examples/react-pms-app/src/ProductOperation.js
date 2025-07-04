import { useState } from "react";
function ProductOperation() {
let [product,setProduct]=useState({pid:"",pname:"",price:"",url:""});       // product object 
let [products,setProducts]=useState([]);                // array of product object 

let [buttonValue,setButtonValue]=useState("Store Product");

let storeProductOrUpdate=(event)=> {
    //console.log("submit event fired")
    event.preventDefault();         // disable action behaviour of submit button 
    //console.log(product)
    if(buttonValue=="Store Product"){
        setProducts([...products,product]);         // ...products previous products, product new product 
    }else {
        alert("ready to update")
        // logic 
        
        setButtonValue("Store Product")
    }
    
    
    
    setProduct({pid:"",pname:"",price:"",url:""})
}

let deleteProduct= (pid)=> {
    //alert("delete function called.."+pid)
    let productIndex = products.findIndex(p=>p.pid==pid);
    let tempProduct = [...products];
    tempProduct.splice(productIndex,1)
    setProducts(tempProduct);
}

let setToUpdateProduct = (product)=> {
    setProduct(product);            // we pass product object of particular row and that we set to product state variable. 
    setButtonValue("Update Button")
}
    return(
        <div>
            <h2>Product Operation</h2>
            <form onSubmit={storeProductOrUpdate}>
                <label>PId</label>
                <input type="text" name="pid" 
                onChange={(event)=>setProduct({...product,"pid":event.target.value})}
                value={product.pid}
                /> <br/>
                <label>PName</label>
                <input type="text" name="pname" 
                onChange={(event)=>setProduct({...product,"pname":event.target.value})}
                value={product.pname}
                /> <br/>
                <label>Price</label>
                <input type="text" name="price" 
                onChange={(event)=>setProduct({...product,"price":event.target.value})}
                value={product.price}
                /> <br/>
                <label>URL</label>
                <input type="text" name="url" 
                onChange={(event)=>setProduct({...product,"url":event.target.value})}
                value={product.url}
                /> <br/>
                <input type="submit" value={buttonValue}/>
                <input type="reset" value="reset"/>
            </form>
            <hr/>
            <p>Number of products {products.length}</p>
            <table border="1">
                <thead>
                        <tr>
                            <th>PId</th>
                            <th>PName</th>
                            <th>Price</th>
                            <th>URL</th>
                            <th>Delete</th>
                            <th>Update</th>
                        </tr>
                </thead>
                <tbody>
                    {
                        products.map(product=>
                            <tr key={product.pid}>
                                <td>{product.pid}</td>
                                <td>{product.pname}</td>
                                <td>{product.price}</td>
                                <td><img src={product.url} width="100px" height="100px"/></td>
                                <td>
                                    <input type="button" value="Delete" onClick={()=>deleteProduct(product.pid)}/>
                                </td>
                                <td>
                                    <input type="button" value="Update" onClick={()=>setToUpdateProduct(product)}/>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    ) 
}

export default ProductOperation;