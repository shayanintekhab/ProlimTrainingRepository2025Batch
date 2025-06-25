package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class SimpleController {

	@GetMapping(value = "hello")
	public String greeting() {
		return "Welcome to second micro sevice project";
	}
}
