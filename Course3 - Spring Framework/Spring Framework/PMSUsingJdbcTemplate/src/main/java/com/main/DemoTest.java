package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
ProductService ps = (ProductService)ac.getBean("productService");
//Product p = new Product(108, "Pencil", 50);
//String result = ps.storeProduct(p);
//System.out.println(result);

List<Map<String, Object>> listOfRecordsAsAMap=		ps.findAllRecordsAsMap();
	Iterator<Map<String, Object>> li = listOfRecordsAsAMap.iterator();
	while(li.hasNext()) {
		Map<String, Object> mm = li.next();
		System.out.println(mm);
	}
	System.out.println("------");
	List<Product> listOfProduct = ps.findAllProductAsListOfProducts();
	for(Product p: listOfProduct) {
		System.out.println(p);
	}
	ac.close();
	}

}







