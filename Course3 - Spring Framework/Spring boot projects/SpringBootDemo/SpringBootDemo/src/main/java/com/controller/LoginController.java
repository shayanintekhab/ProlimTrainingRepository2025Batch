package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@RequestMapping(value = "checkLoginDetails",method = RequestMethod.POST)
	public String checkLoginDetails(HttpServletRequest req) {
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
