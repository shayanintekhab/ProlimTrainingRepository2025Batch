package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	DataSource ds;	// search data source details in beans.xml file. by default byType 
	
	public int storeProduct(Product product) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, product.getPid());
			pstmt.setString(2, product.getName());
			pstmt.setFloat(3, product.getPrice());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> findProducts() {
		List<Product> listOfProduct = new ArrayList<Product>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				listOfProduct.add(p);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listOfProduct;
	}
}






