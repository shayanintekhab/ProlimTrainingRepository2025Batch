package com;
import java.sql.*;
import java.util.Scanner;
public class DemoJdbTestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// type 4 driver for mysql 
			System.out.println("Driver loaded...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prolim_db", "root", "root@123");
System.out.println("Connected to db");
		//Statement stmt = con.createStatement();
		
		
		// insert Query 
//		int temp= stmt.executeUpdate("insert into product values(103,'Laptop',97000)");
//		if(temp>0) {
//			System.out.println("Record inserted successfully");
//		}
		
		// delete query 
//		int temp= stmt.executeUpdate("delete from product where pid=103");
//		if(temp>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		// update query 
//		int temp= stmt.executeUpdate("update product set price=68000 where pid=100");
//		if(temp>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
//		// retrieve query 
//		ResultSet rs = stmt.executeQuery("select * from product");
//		while(rs.next()) {
//		//System.out.println("id is "+rs.getInt(1)+" PName "+rs.getString(2)+" Price "+rs.getFloat(3));
//		System.out.println("id is "+rs.getInt("pid")+" PName "+rs.getString("pname")+" Price "+rs.getFloat("price"));
//		}
		
		// insert Query 
//		int temp= stmt.executeUpdate("insert into product values("+pid+",'Laptop',97000)");
//		if(temp>0) {
//			System.out.println("Record inserted successfully");
//		}
		
		Scanner sc = new Scanner(System.in);
		// insert query using PreparedStatement 
		Statement stmt = con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		
		System.out.println("Enter the product pid");
		int pid = sc.nextInt();
		pstmt.setInt(1, pid);				// for 1st ? pid value set 
		
		System.out.println("Enter the product name");
		String name = sc.next();
		pstmt.setString(2, name);		// for 2nd ? pname value set 
		
		
		System.out.println("Enter the product price");
		float price = sc.nextFloat();
		pstmt.setFloat(3, price);		// for 3rd ? price value set 
		
		int temp = pstmt.executeUpdate();
		
		if(temp>0) {
			System.out.println("Record inserted successfully...");
		}
		// close the resource properly
		//rs.close();
		//stmt.close();
		con.close();
		
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
