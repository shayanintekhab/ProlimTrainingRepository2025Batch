package com.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class LoginPageTest extends BaseAutomationTest{
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] 
    		  { "student", "Password123",true,""},
    		  { "user1", "Password123",false,"Your username is invalid!"},
    		  { "student", "student@123",false,"Your password is invalid!"},
    		  { "", "Password123",false,"Your username is invalid!"},
    		  { "student", "",false,"Your password is invalid!"}
    };
  }
  
  @Test(dataProvider = "dp")
  public void loginAutomationTestPage(String username,String password,boolean exptectedSuccess,String expectedErrorMessage) {
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  LoginPage lp = new LoginPage(driver);
	 
	  try {
		  lp.login(username, password);
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	  if(exptectedSuccess) {
		  assertTrue(lp.isLoggingSuccessfully());
	  }else {
		  String actualErrorMessage = lp.getErrorMessage();
		  assertEquals(actualErrorMessage, expectedErrorMessage);
	  }
  }
}
