import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";
function Products() {
let URL = "http://localhost:3000/products";
let [products,setProducts] = useState([]);
useEffect(()=> {
    axios.get(URL).then(result=>setProducts(result.data)).catch(err=>console.log(err));
},[]);
    return(
        <div>
            <h2>All Products</h2>
            {
                products.map((product, index) => {
                    return (
                        <div key={index}>
                            <h3>{product.id} ) {product.pname}</h3>
                            <p>Price: ${product.price}</p>
                        </div>
                    )
                })
            }
        </div>
    )
}

export default Products;