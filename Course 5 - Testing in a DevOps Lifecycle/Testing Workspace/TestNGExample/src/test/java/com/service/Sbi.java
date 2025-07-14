package com.service;

import org.testng.annotations.Test;

public class Sbi {
  @Test(groups = "withdraw_functionality")
  public void withdraw() {
	  System.out.println("Sbi withdraw functionality");
  }
  
  @Test
  public void deposit() {
	  System.out.println("Sbi deposit functionality");
  }
  @Test
  public void transfer() {
	  System.out.println("Sbi transfer functionality");
  }
}
