package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;

@RestController
@RequestMapping("product")
public class ProductController {

	@GetMapping(value = "info")
	public String getProductInfo() {
		return "Product controller message";
	}
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProducts() {
		List<Product> listOfproduct = new ArrayList<Product>();
		Product p1 = new Product(100, "TV", 45000);
		Product p2 = new Product(101,"Computer",35000);
		listOfproduct.add(p1);
		listOfproduct.add(p2);
		return listOfproduct;
	}
}
