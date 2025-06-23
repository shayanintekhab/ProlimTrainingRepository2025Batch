package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController     // @Controller + @ResponseBody
public class MessageController {

	// http://localhost:8080/hi
	
	@RequestMapping(value = "hi")
	public String sayHi() {
		return "Welcome to Spring boot with plain text format";
	}
	@RequestMapping(value = "text",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h1>Welcome to Spring boot</h1>";
	}
	@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h1>Welcome to Spring boot</h1>";
	}
	@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<abc>Welcome to Spring boot</abc>";
	}
}
