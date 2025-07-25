package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "CheckLoginDetails",method = RequestMethod.POST)
	public ModelAndView checkLoginInformation(HttpServletRequest req) { // DI for request object. 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		ModelAndView mav = new ModelAndView();
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
