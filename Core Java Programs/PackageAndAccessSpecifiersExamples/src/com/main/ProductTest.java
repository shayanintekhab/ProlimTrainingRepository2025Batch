package com.main;

import com.bean.Product;

public class ProductTest {

	public static void main(String[] args) {
		// 1st way 
		Product p1 = new Product();
		p1.setPid(100);
		p1.setPname("TV");
		p1.setPrice(56000);
		p1.setQty(10);
		
		System.out.println("pid is "+p1.getPid());
		System.out.println("pname is "+p1.getPname());
		System.out.println("price is "+p1.getPrice());
		System.out.println("qty is "+p1.getQty());
		
		//2nd way 
		Product p2 = new Product(101, "Computer", 34000, 25);
		
		System.out.println("pid is "+p2.getPid());
		System.out.println("pname is "+p2.getPname());
		System.out.println("price is "+p2.getPrice());
		System.out.println("qty is "+p2.getQty());
		
		
		// 3rd way 
		
		Product p3 = new Product(102, "Laptop", 95000, 5);
		
		System.out.println(p3);		// to toString method that return return object details in string format 
	}

}
