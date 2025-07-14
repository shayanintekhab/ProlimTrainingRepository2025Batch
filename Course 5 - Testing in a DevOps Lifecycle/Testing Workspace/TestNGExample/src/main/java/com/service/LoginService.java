package com.service;

public class LoginService {

	public String checkLoginDetails(String emaiId,String password) {
		// we can check from db. 
		if(emaiId.equals("admin@gmail.com") && password.equals("admin@123")) {
			return "Admin login successfully";
		}else if(emaiId.equals("raj@gmail.com") && password.equals("raj@123")) {
			return "Customer login successfully";
		}else {
			return "InValid emailid or password";
		}
	}
}
