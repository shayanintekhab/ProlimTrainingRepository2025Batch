package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseAutomationTest {
  
	WebDriver driver;
	
	@BeforeMethod
	 public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
  @Test
  public void practiceTestPageTest() {
	  //System.out.println(driver.getClass());
	  driver.get("https://practice-automation.com/");
	  WebElement element = driver.findElement(By.tagName("strong"));
	  //System.out.println(element.getTagName()+" = "+element.getText());
	  String actualData = element.getText();
	  assertEquals(actualData, "Welcome to your software automation practice website!");
  }
  
  @AfterMethod
  public void afterMethod() {
	  if(driver!=null) {
		  driver.quit();  
	  }
  }

}
