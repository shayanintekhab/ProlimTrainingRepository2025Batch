package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class SimpleController {

	// http://localhost:8080/first/hello
	
	@GetMapping(value = "hello")
	public String greeting() {
		return "Welcome to first micro service project";
	}
}
