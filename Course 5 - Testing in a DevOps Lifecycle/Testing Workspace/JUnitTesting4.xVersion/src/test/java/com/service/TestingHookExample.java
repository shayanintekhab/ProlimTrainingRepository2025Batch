package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingHookExample {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test start -  only once");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After all test done -  only once");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void test1() {
		System.out.println("first test method");
	}
	@Test
	public void test2() {
		System.out.println("second test method");
	}

}
