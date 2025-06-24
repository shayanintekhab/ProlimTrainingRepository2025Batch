package com.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.bean.Product;
import com.repository.OrdersRepository;
import com.repository.ProductRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	public String placeOrders(Orders order) {	// oid auto increment, pid(100);
		Optional<Product> result = productRepository.findById(order.getPid());
		if(result.isPresent()) {
			order.setOrderdateandtime(LocalDateTime.now());  // set current date and time
			ordersRepository.save(order);
			return "Order placed successfully";
		}else {
			return "Product not preset, order didn't place";
		}
	}
	public List<Orders> findAllOrders() {
		return ordersRepository.findAll();
	}
}
