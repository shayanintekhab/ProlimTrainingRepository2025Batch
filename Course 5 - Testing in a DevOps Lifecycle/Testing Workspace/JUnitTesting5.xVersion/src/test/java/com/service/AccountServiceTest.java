package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.bean.Account;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
	@Order(1)
	void testAccountCreate() {
		// assert condition account created
		// assert condition accno number must be unique 
		// amount must > 1000
		Account acc1= new Account(100, "Ravi", 1200);
		Account acc2= new Account(101, "Raj", 900);
		Account acc3= new Account(100, "Ramesh", 1200);
		String result1 = as.accountCreate(acc1);
		String result2 = as.accountCreate(acc2);
		String result3 = as.accountCreate(acc3);
		assertEquals("Account created", result1);
		assertEquals("Min amount must be >=1000", result2);
		assertEquals("Account alreay exists", result3);
	}

	@Test
	@Disabled
	void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	@Order(2)
	void testGetAllAccounts() {
		List<Account> listOfAccount = as.getAllAccounts();
		assertEquals(1, listOfAccount.size());
	}

	@Test
	@Disabled
	void testGetAccountDetails() {
		fail("Not yet implemented");
	}

}
