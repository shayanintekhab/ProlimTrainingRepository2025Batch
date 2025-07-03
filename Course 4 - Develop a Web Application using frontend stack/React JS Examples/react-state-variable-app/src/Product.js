import { useState } from "react";

function Product() {
let [product,setProduct]=useState({pid:100,pname:"TV","price":56000}); //object type 
                                // array of object type 
let [products,setProducts]=useState([
    {pid:100,pname:"TV","price":56000},
    {pid:101,pname:"Computer","price":42000},
    {pid:102,pname:"Laptop","price":97000},
    {pid:103,pname:"Pen Drive","price":1500}
])
    return(
        <div>
            <h3>Product Details</h3>
            <p>PId {product.pid} PName is {product.pname} Price : {product.price}</p>
            <table border="1">
                <caption>Product Information</caption>
                <thead>
                <tr>
                    <th>PId</th>
                    <th>PName</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                {
                    products.map((product,index)=>
                        <tr key={product.pid}>
                            <td>{product.pid}</td>
                            <td>{product.pname}</td>
                            <td>{product.price}</td>
                        </tr>
                    )
                }
                </tbody>
            </table>
        </div>
    )
}
export default Product;