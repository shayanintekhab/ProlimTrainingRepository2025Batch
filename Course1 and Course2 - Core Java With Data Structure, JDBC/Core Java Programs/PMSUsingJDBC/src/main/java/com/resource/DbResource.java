package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {

	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/prolim_db", "root", "root@123");
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error in Db Connection "+e);
			return null;
		}
	}
}
