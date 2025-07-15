package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By userNameField = By.id("username");
	By passwordField = By.id("password");
	By submitButton = By.id("submit");
	By errorMessage = By.id("error");
	By successMsg = By.tagName("strong");
	// Congratulations student. You successfully logged in!
	public LoginPage() {
		super();
		
	}
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void login(String username,String password) {
		driver.findElement(userNameField).clear();
		driver.findElement(userNameField).sendKeys(username);
		
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
		
		driver.findElement(submitButton).click();
	}
	
	public boolean isLoggingSuccessfully() {
		return driver.getPageSource().contains("Logged In Successfully");
	}
	
	public String getErrorMessage() {
		return driver.findElement(errorMessage).getText();
	}
}
