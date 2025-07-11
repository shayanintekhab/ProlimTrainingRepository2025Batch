package com.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dao.ProductDao;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class ProductServiceMockTest {

	
	@Mock
	ProductDao productDao;
	
	@InjectMocks
	ProductService productService;
	
	@Test
	void testCallProductDaoMethod() {
		when(productService.callProductDaoMethod()).thenReturn("Fake Response");
		
		String result = productService.callProductDaoMethod();
		assertEquals("Fake Response", result);
	}

}
