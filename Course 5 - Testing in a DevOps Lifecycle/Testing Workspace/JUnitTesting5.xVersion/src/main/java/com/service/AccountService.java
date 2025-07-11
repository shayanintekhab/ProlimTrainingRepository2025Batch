package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Account;
import com.dao.AccountDao;

public class AccountService {

	private List<Account> listOfAccount = new ArrayList<Account>();
	
	AccountDao ad = new AccountDao();
	
	public String accountCreate(Account account) {		// accno must be unique, amount > 1000 
		int flag=0;
		if(listOfAccount.size()==0) {
			if(account.getAmount()<=1000) {
				return "Min amount must be >=1000";
			}else {
				listOfAccount.add(account);
				return "Account created";
			}
		}
		Iterator<Account> li = listOfAccount.iterator();
		while(li.hasNext()) {
			Account acc = li.next();
			if(acc.getAccno()==account.getAccno()) {
				flag++;
				break;
			}
		}
		
			if(flag>0) {
				return "Account alreay exists";
			}else {
				if(account.getAmount()<=1000) {
					return "Min amount must be >=1000";
				}else {
					listOfAccount.add(account);
					return "Account created";
				}
			}
		
	}
	
	public float getBalance(int accno) {
		
		return 0.0f;
	}
	
	public List<Account> getAllAccounts() {
		return listOfAccount;
	}
	
	public Account getAccountDetails(int accno) {
		
		return null;
	}
	
	public List<Account> findAllAccountsFromDb() {
		// we can write some conditions. 
		System.out.println("I Came to service layer");
		return ad.getAllAccount();
	}
}





