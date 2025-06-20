package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage(Model mm) {  // DI for Model API for of spring mvc 
		mm.addAttribute("info", "Welcome to Product Management System");
		return "index";
	}
	
	@RequestMapping(value = "/addProductPage",method = RequestMethod.GET)
	public String addProductPageOpen(Model mm,Product product) {  // DI for Model API for of spring mvc as well as product entity class 
		mm.addAttribute("info", "Welcome to Product Management System");
		mm.addAttribute("pp", product);   // store product object in model scope. 
		return "addProduct";
	}
	
	@RequestMapping(value = "/storeProduct",method = RequestMethod.POST)
	public String storeProductInDb(Model mm,Product product) {  // DI for Model API for of spring mvc as well as product entity class 
		mm.addAttribute("info", "Welcome to Product Management System");
		String result = productService.storeProduct(product);
		mm.addAttribute("pp", product);   // store product object in model scope.
		mm.addAttribute("msg", result);
		return "addProduct";
	}
	
	@RequestMapping(value = "/viewProductPage",method = RequestMethod.GET)
	public String viewPageOpen(Model mm) {  // DI for Model API for of spring mvc 
		mm.addAttribute("info", "Welcome to Product Management System");
		List<Product> listOfProduct = productService.findAllProducts();
		mm.addAttribute("products", listOfProduct); 
		return "viewProduct";
	}
}


