package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	@Autowired
	RestTemplate restTemplate;		// this class reference help us to call any rest api or micro service develop using any language 
	
	public String gpayAccountCreate(Gpay gpay) {	// contains only emailid 
	String emailid = gpay.getEmailid();
	int accno=restTemplate.getForObject("http://localhost:8282/account/findAccountNumber/"+emailid, Integer.class);
	if(accno==-1) {
		return "Gpay accont didn't create, account not present";
	}else {
		gpay.setAccno(accno);
		gpayRepository.save(gpay);
		return "Gpay account created successfully";
	}
	}
}
