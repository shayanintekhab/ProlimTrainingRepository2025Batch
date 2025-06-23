package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	// http://localhost:8080/singleQueryParam?uname=John&age=21
	
	@RequestMapping(value = "singleQueryParam",method = RequestMethod.GET)
	public String singleQueryParam(@RequestParam("uname") String name,@RequestParam("age") int age) {
		return "Welcome to Spring boot with single query param concept "+name+" your age is "+age;
	}
	
	// http://localhost:8080/singlePathParam/John/21
	
		@RequestMapping(value = "singlePathParam/{uname}/{age}",method = RequestMethod.GET)
		public String singlePathParam(@PathVariable("uname") String name,@PathVariable("age") int age) {
			return "Welcome to Spring boot with single path param concept "+name+" your age is "+age;
		}
}
