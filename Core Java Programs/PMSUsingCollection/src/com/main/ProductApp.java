package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class ProductApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		String con="";
		int pid;
		String pname;
		float price;
		int qty;
		String result;
		do {
System.out.println("1: Add Product 2 :Display Products 3: Delete Product 4: Update product 5 :Search Product ");
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
					System.out.println("Enter the number of qty");
					qty = sc.nextInt();
					
					Product p = new Product(pid, pname, price,qty);
					
					result = ps.storeProduct(p);
					
					System.out.println(result);
					break;
			case 2: System.out.println("All Product details");
					List<Product> products=ps.findAllProduct();
					for(Product product : products) {
						System.out.println(product);		// it call toString method 
					}
					break;
			case 3 :System.out.println("Delete Product operation");
					System.out.println("Enter the product id");
					pid = sc.nextInt();
			        result = ps.deleteProduct(pid);
			        System.out.println(result);
			        break;
			case 4 : System.out.println("Update product price");
				
					System.out.println("Enter the product id");
					pid = sc.nextInt();

					System.out.println("Enter the price");
					price = sc.nextFloat();
					
					Product p2 = new Product();
					p2.setPid(pid);
					p2.setPrice(price);
					result = ps.updateProductPrice(p2);
					System.out.println(result);
					break;
			case 5 :System.out.println("Search product");
					System.out.println("Enter the product id");
					pid = sc.nextInt();
			
					Product product = ps.findProduct(pid);
					if(product==null) {
						System.out.println("Product not present");
					}else {
						System.out.println(product);  // toString method called..
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
