package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Users;
import com.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	public String storeUsers(Users user) {
		usersRepository.save(user);
		return "User stored";
	}
	public List<Users> findAllUsers() {
		return usersRepository.findAll();
	}
}
