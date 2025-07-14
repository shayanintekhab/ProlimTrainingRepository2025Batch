package com;

import java.io.FileWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the  browser driver path. 
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	// created driver reference. 
		
		driver.get("https://www.google.com");
			String currentURL = driver.getCurrentUrl(); 
		System.out.println("Current Page URL "+currentURL);
			String title = driver.getTitle();
		System.out.println("Google page title "+title);
			String sourceCode = driver.getPageSource();
		//System.out.println(sourceCode);
		FileWriter fw = new FileWriter("google.html");
		fw.write(sourceCode);
		fw.close();
		driver.close();
		}catch(Exception e) {}
	}

}
