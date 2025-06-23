package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController     // @Controller + @ResponseBody
public class MessageController {

	// http://localhost:8080/hi
	
	@RequestMapping(value = "hi")
	public String sayHi() {
		return "Welcome to Spring boot with plain text format";
	}
}
