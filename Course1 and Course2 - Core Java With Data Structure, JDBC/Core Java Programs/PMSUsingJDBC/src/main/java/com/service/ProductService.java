package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

// pure business methods 
public class ProductService {
	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<0) {
			return "Product price must be > 0";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	
	public String updateProduct(Product product) {
		if(pd.updateProduct(product)>0) {
			return "Product price updated successfully";
		}else {
			return "Product price didnt' update";
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product didn't update";
		}
	}
	
	public List<Product> findAllProducts() {
		List<Product> listOfProduct = pd.findProducts();
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			// 10% 
			float discount = p.getPrice()*0.10f;
			p.setPrice(p.getPrice()-discount);	
		}
		return listOfProduct;
	}
}
