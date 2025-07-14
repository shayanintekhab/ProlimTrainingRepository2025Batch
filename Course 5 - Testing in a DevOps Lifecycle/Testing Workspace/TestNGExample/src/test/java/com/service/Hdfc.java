package com.service;

import org.testng.annotations.Test;

public class Hdfc {
	  @Test(groups = "withdraw_functionality")
	  public void withdraw() {
		  System.out.println("Hdfc withdraw functionality");
	  }
	  
	  @Test
	  public void deposit() {
		  System.out.println("Hdfc deposit functionality");
	  }
	  @Test
	  public void transfer() {
		  System.out.println("Hdfc transfer functionality");
	  }
}
