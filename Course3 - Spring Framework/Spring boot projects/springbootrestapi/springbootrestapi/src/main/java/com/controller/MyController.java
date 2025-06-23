package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	// http://localhost:8080/hello
	
	@RequestMapping(value = "hello")
	public @ResponseBody String sayHello() {
		return "Welcome to Spring boot with simple rest api";
	}
}
