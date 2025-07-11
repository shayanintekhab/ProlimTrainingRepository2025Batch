package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OperationTest {

  @Test
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op = new Operation();
	  int result = op.add(100, 200);
	  assertEquals(result, 300);
  }

  @Test
  public void subTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op = new Operation();
	  int result = op.sub(400, 200);
	  assertEquals(result, 200);
  }
}
