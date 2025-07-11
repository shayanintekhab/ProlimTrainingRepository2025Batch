package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String callProductDaoMethod() {
		// conditions 
		
		
		return productDao.getProductInfoFromDb();
	}
}
