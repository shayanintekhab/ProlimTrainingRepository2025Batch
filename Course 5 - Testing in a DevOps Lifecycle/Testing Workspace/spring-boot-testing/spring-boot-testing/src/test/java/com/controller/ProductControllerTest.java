package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bean.Product;

@SpringBootTest
class ProductControllerTest {

	@Autowired
	ProductController productController;
	
	@Test
	void testGetProductInfo() {
		//fail("Not yet implemented");
		String result = productController.getProductInfo();
		assertEquals("Product controller message", result);
	}
	
	
	@Test
	void testFindAllProducts() {
		//fail("Not yet implemented");
		List<Product> listOfProduts = productController.findAllProducts();
		assertEquals(2,listOfProduts.size());
	}

}
