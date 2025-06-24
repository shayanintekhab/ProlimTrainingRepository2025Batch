package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("product")		// http://localhost:8080/product/*
public class ProductController {
	@Autowired
	ProductService productService;
	//@RequestMapping(value = "store",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	@GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAll() {
		return productService.findAllProducts();
	}
	@DeleteMapping(value = "delete/{pid}")
	public String deleteProduct(@PathVariable int pid) {
		return productService.deleteProduct(pid);
	}
	@PutMapping(value = "update",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductPrice(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	
}
