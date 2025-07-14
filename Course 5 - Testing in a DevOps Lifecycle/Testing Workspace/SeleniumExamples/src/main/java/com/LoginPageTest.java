package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	// created driver reference. 
		
		driver.get("http://127.0.0.1:5500/login.html");
		
		WebElement h2TagRef = driver.findElement(By.tagName("h2"));	// name selector 
		//System.out.println(h2TagRef.getTagName()+" "+h2TagRef.getText());
		
		WebElement emailId = driver.findElement(By.id("email"));	// id selector 
		WebElement password = driver.findElement(By.id("password"));	// id selector 
		
		emailId.sendKeys("admin@gmail.com");
		password.sendKeys("admin@123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));	// id selector 
		
		submitButton.click();
		
		String targetPageURL = driver.getCurrentUrl();
		System.out.println(targetPageURL);
		
		driver.close();
	}

}
