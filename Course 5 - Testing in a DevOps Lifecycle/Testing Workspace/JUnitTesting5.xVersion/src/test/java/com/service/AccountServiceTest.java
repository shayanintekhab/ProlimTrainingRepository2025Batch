package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AccountServiceTest {

	static AccountService as;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		as = new AccountService();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		as = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAccountCreate() {
		// assert condition account created
		// assert condition accno number must be unique 
		// amount must > 1000
	}

	@Test
	@Disabled
	void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAllAccounts() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAccountDetails() {
		fail("Not yet implemented");
	}

}
