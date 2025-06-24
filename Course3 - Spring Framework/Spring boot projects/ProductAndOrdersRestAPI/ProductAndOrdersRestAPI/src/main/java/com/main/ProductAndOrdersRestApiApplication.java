package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")	// Enable @RestController, @Service, @Repository annotation 
@EntityScan(basePackages = "com.bean")				// Enable @Entity annotation part of jpa 
@EnableJpaRepositories(basePackages = "com.repository") // Enable spring Jpa Data Features 
public class ProductAndOrdersRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAndOrdersRestApiApplication.class, args);
		System.out.println("spring boot jpa data up");
	}

}
