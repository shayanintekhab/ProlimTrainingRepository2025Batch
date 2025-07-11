package com.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bean.Account;
import com.dao.AccountDao;

@ExtendWith(MockitoExtension.class)
class AccountServiceMockTest {

	@Mock
	AccountDao accountDao;
	
	@InjectMocks
	AccountService accountService;	// service layer inject dao layer mock 
	
	@Test
	void testFindAllAccountsFromDb() {
//		List<Account> listOfFakeAccounts = new ArrayList<Account>();
//		listOfFakeAccounts.add(new Account(1, "Ravi", 1200));
//		listOfFakeAccounts.add(new Account(2, "Ramesh", 1600));
//		// fake output 
//		//when(accountService.findAllAccountsFromDb()).thenReturn(listOfFakeAccounts);
//		
//		// actual test 
//		List<Account> testAccountDetails = accountService.findAllAccountsFromDb();
//		assertEquals(2, testAccountDetails.size());
		
		
		// check actual test 
		when(accountService.findAllAccountsFromDb()).thenCallRealMethod();
		List<Account> testAccountDetails = accountService.findAllAccountsFromDb();
		//assertNull(testAccountDetails);
		assertEquals(1, testAccountDetails.size());
//		
	}

}
