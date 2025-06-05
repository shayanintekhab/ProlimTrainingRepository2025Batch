package com.service;

import com.model.Product;

public class ProductService {

	private Product products[]=new Product[10];
	public static int index;
	public String addProduct(Product product) {	// passing the object as parameter 
		// logic 
		// before add check pid must be unique 
		// before add check product price must be > value 
		// like we can add many conditions. 
		products[index]=product;
		index++;
		//System.out.println("Product stored..");
		return "Product stored";
	}
	// delete product using pid, 
	// update product price using pid,
	// search the product using pid, or price or pname etc 
	
	public Product[] getAllProducts() {
		return products;
	}
}
