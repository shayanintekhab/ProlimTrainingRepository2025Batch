package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	@Query("select acc.accno from Account acc where acc.emailid = :emailid")
	public int findAccountNumber(@Param("emailid") String emailid);
	// @param annotation help use to set the value for label and @query annotation 
	// use to write custom JPQL query 
}
