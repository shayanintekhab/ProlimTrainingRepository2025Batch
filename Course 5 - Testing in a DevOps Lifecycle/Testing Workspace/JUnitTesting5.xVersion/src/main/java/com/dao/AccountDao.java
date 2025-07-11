package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.bean.Account;

public class AccountDao {

	public List<Account> getAllAccount() {
			// we retrieve all account details from DB
		// using jdbc or jdbcTemplate or jpa or Spring JPA Data 
		// we write jdbc or jpa code to retrieve account details from db. 
		System.out.println("I Came to dao layer");
		List<Account> fromDb = new ArrayList<Account>();
		fromDb.add(new Account(1, "Ravi", 1200));
		return fromDb;
	}
}
