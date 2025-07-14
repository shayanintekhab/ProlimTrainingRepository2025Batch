package com.service;

import org.testng.annotations.Test;

public class PriorityTestExample {
  @Test(priority = 1)
  public void b() {
	  System.out.println("b test function");
  }
  @Test(priority = 3)
  public void a() {
	  System.out.println("a test function");
  }
  @Test(priority = 2)
  public void A() {
	  System.out.println("A test function");
  }
  @Test(priority = 5)
  public void d() {
	  System.out.println("d test function");
  }
  @Test(priority = 4)
  public void c() {
	  System.out.println("c test function");
  }
}
