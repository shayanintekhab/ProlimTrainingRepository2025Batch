package com;
import java.sql.*;
public class DemoJdbTestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// type 4 driver for mysql 
			System.out.println("Driver loaded...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prolim_db", "root", "root@123");
System.out.println("Connected to db");
		Statement stmt = con.createStatement();
		
		
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
		
		// retrieve query 
		ResultSet rs = stmt.executeQuery("select * from product");
		while(rs.next()) {
		//System.out.println("id is "+rs.getInt(1)+" PName "+rs.getString(2)+" Price "+rs.getFloat(3));
		System.out.println("id is "+rs.getInt("pid")+" PName "+rs.getString("pname")+" Price "+rs.getFloat("price"));
		}
		
		
		// close the resource properly
		rs.close();
		stmt.close();
		con.close();
		
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
