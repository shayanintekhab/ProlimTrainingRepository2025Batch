package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testAdd() {	// like main method 
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void testSub() {	// like main method 
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.sub(200, 100);
		assertEquals(100, result);
	}

	@Test
	public void testMul() {	// like main method 
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.mul(5, 2);
		assertEquals(10, result);
	}
	
	@Test
	public void testDiv() {	// like main method 
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.div(200, 100);
		assertEquals(2, result);
	}
}
