package com.main;

import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		String con="";
		int pid;
		String pname;
		float price;
		String result;
		do {
			System.out.println("1: Add Product 2 :Display Products");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:	System.out.println("Add Product");
					System.out.println("Enter the product id");
					pid = sc.nextInt();
					System.out.println("Enter the product name");
					pname = sc.next();
					System.out.println("Enter the price");
					price = sc.nextFloat();
					
					Product p = new Product(pid, pname, price);
					
					result = ps.addProduct(p);
					
					System.out.println(result);
					break;
			case 2: System.out.println("All Product details");
					Product products[]=ps.getAllProducts();
					for(int i=0;i<ProductService.index;i++) {
						Product p1 = products[i];
						System.out.println(p1);		// it call toString method 
					}
					break;
			default:	System.out.println("Wrong choice");
					break;
			}
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		}while(con.equals("y"));
		System.out.println("Thank you!");

	}

}
