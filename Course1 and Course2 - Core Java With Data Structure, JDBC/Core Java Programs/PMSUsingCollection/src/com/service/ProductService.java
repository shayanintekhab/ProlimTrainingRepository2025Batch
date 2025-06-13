package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {

	List<Product> listOfProducts = new ArrayList<Product>();

	public String storeProduct(Product product) {
		int temp=0;
		if(listOfProducts.size()==0) {
			listOfProducts.add(product);
			return "Product stored successfully";
		}
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()== product.getPid()) {
				temp++;
				break;
			}
		}
		
		if(temp==0) {
			listOfProducts.add(product);
			return "Product stored successfully";
		}else {
			temp=0;
			return "Product id must be unique";
		}
	}
	
	public String deleteProduct(int pid) {
		int temp=0;
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()== pid) {
				li.remove();
				temp++;
				break;
			}
		}
		
		if(temp==0) {
			return "Product not preset";
		}else {
			temp=0;
			return "Product removed succesfully";
		}
	}

	

	public String updateProductPrice(Product product) {	// pid and price
		int temp=0;
		
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()== product.getPid()) {
				p.setPrice(product.getPrice());
				temp++;
				break;
			}
		}
		
		if(temp==0) {
			return "Product not present";
		}else {
			temp=0;
			return "Product price updated successfully";
		}
	}
	
	public Product findProduct(int pid) {
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()== pid) {
				return p;
			}
		}
		
		return null;
	}
	
	public List<Product> findAllProduct() {
		return listOfProducts;
	}
	
}
