import { useState } from "react";
function ProductOperation() {
let [product,setProduct]=useState({pid:"",pname:"",price:"",url:""});       // product object 
let [products,setProducts]=useState([]);                // array of product object 
let storeProduct=(event)=> {
    console.log("submit event fired")
    event.preventDefault();         // disable action behaviour of submit button 
    //console.log(product)
    setProducts([...products,product]);         // ...products previous products, product new product 
    setProduct({pid:"",pname:"",price:"",url:""})
}
    return(
        <div>
            <h2>Product Operation</h2>
            <form onSubmit={storeProduct}>
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
                <input type="submit" value="Store Product"/>
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
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    ) 
}

export default ProductOperation;