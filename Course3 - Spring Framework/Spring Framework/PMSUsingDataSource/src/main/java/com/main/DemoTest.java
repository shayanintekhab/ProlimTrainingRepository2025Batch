package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
ProductService ps = (ProductService)ac.getBean("productService");
Product p = new Product(106, "Pen", 250);
String result = ps.storeProduct(p);
System.out.println(result);
	ac.close();
	}

}
