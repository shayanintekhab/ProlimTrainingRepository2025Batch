package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Orders;
import com.service.OrdersService;

@RestController
@RequestMapping("order")			// http://localhost:8080/order/*
public class OrdersController {

	@Autowired
	OrdersService orderService;
	
	@GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> findAllOrdersDetails() {
		return orderService.findAllOrders();
	}
	
	@PostMapping(value = "placeOrder",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder(@RequestBody Orders order) {
		return orderService.placeOrders(order);
	}
}
