package com.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(product.getPrice()<0) {
			return "Product price must be +ve";
		}else if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	
	public List<Product> findAllProducts() {
		// we can write some business logic. 
		List<Product> listOfProduct = productDao.findProducts();
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product  p = li.next();
			if(p.getPrice()>60000) {
				p.setPrice(p.getPrice()-p.getPrice()*0.10f);
			}else {
				p.setPrice(p.getPrice()-p.getPrice()*0.20f);
			}
		}
		return listOfProduct;
	}
}


