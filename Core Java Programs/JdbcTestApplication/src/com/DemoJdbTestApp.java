package com;
import java.sql.*;
public class DemoJdbTestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// type 4 driver for mysql 
			System.out.println("Driver loaded...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prolim_db", "root", "root@123");
System.out.println("Connected to db");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
