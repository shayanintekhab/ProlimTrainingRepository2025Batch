package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	// http://localhost:8080/
	
	@RequestMapping(value = "/")
	public String openFirstPage() {
		System.out.println("I Came here");
		// coding 
		return "index";			// return page name without extension 
	}
	
	// http://localhost:8080/aboutus
	@RequestMapping(value = "/aboutus")
	public String aboutUsPage() {
		System.out.println("I Came here");
		// coding 
		return "aboutus";			// return page name without extension 
	}

	// http://localhost:8080/contactus

	@RequestMapping(value = "/contactus")
	public String contatUspage() {
		System.out.println("I Came here");
		// coding 
		return "contactus";			// return page name without extension 
	}
	
	@RequestMapping(value = "/loginPage")
	public String loginPageOpen() {
		System.out.println("I Came here");
		// coding 
		return "login";			// return page name without extension 
	}
}
