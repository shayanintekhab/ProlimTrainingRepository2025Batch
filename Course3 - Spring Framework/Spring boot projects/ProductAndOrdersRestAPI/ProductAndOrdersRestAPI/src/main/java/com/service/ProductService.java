package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();  // findAll pre defined method part of JpaRepository 
	}
	
	public String storeProduct(Product product) {
		//productRepository.save(product);
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			return "Product id must be unique";
		}else {
			productRepository.save(product);
			return "Product stored";
		}
	}
	
	public String deleteProduct(int pid) {
		//productRepository.save(product);
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			productRepository.deleteById(pid);
			return "Product deleted successfully";
		}else {
			return "product not present";
		}
	}
	
	public String updateProduct(Product product) {	// hold pid and newprice 
		//productRepository.save(product);
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p  = result.get();   // p hold pid, pname and price from db. 
			p.setPrice(product.getPrice());  // replace new price 
			productRepository.saveAndFlush(p);
			return "Product updated successfully";
		}else {
			return "Product not preset";
		}
	}
}






