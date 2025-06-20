package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// spring boot by default enable @controller, @service, @repository annotation if all class 
// part of same package or sub package of same package. 
@SpringBootApplication(scanBasePackages = "com") // Enable @repository, @service and @controller 
@EntityScan(basePackages = "com.bean")   // enable @Entity ORM annotation 
public class SpringBootPmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPmsApplication.class, args);
		System.out.println("spring boot with jpa up");
	}

}
