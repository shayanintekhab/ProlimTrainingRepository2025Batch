package com.service;

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
}
