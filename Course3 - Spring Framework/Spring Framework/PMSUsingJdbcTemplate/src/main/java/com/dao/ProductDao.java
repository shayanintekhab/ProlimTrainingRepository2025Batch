package com.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int storeProduct(Product product) {
	try {
	return jdbcTemplate.update("insert into product values(?,?,?)", product.getPid(),product.getName(),product.getPrice());
	} catch (Exception e) {
		System.err.println(e);
		return 0;
	}
	
}

	public int deleteProduct(int pid) {
	try {
	return jdbcTemplate.update("delete from product where pid = ?", pid);
	} catch (Exception e) {
		System.err.println(e);
		return 0;
	}
	
}
	
	public int updateProduct(Product product) {
	try {
	return jdbcTemplate.update("update product set price = ? where pid=?", product.getPrice(),product.getPid());
	} catch (Exception e) {
		System.err.println(e);
		return 0;
	}
	}
	//queryForMap return list of map. each map object refer to 1 record
	
	public List<Map<String, Object>> findAllProductsAsMapObject() {
		try {
	return jdbcTemplate.queryForList("select * from product");		
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

	public List<Product> findAllProductsAsListOfProducts() {
		try {
	return jdbcTemplate.query("select * from product", new MyRowMapper());		
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
}

// convert each record to object as global while loop 
class MyRowMapper implements RowMapper<Product>{
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("row num "+rowNum);
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		return p;
	}
}



