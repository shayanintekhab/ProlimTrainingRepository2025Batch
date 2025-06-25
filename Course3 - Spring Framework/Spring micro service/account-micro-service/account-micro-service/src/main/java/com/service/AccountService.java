package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			return "Account already exists";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	
	public String createAccount(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		if(result.isPresent()) {
			Account account = result.get();
			return "Your balance is "+account.getAmount();
		}else {
			return "Account not exists";
		}
	}
	
	public int findAccountNumber(String emailid) {
		try {
		return accountRepository.findAccountNumber(emailid);
		}catch(Exception e) {
			return -1;
		}
	}
}
