package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginServiceTest {

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] {
			{"admin@gmail.com","admin@123","Admin login successfully"},
			{"raj@gmail.com","raj@123","Customer login successfully"},
			{"ravi@gmail.com","ravi@123","InValid emailid or password"}
		};
	}
	
  @Test(dataProvider = "loginData")
  public void checkLoginDetailsTest(String emailId,String password,String expectedOutput) {
	  //System.out.println(emailId+" "+password);
	  LoginService ls = new LoginService();
	  String actualOutput = ls.checkLoginDetails(emailId, password);
	  assertEquals(actualOutput, expectedOutput);
  }
}
