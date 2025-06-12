package com.main;

import java.util.List;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
//	Product p1 = new Product(105, "Pen Drive", 1400);
//	ProductService ps = new ProductService();
//	String result = ps.storeProduct(p1);
//	System.out.println(result);
		
		ProductService ps = new ProductService();
	List<Product> listOfProduct = ps.findAllProducts();
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	}

}
