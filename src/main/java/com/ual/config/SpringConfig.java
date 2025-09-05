package com.ual.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;

import com.ual.dto.Customer;

@Configuration
public class SpringConfig {
	//@Scope("prototype")
	@Bean
	public Customer customer() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setAge(21);
		
		return customer;
	}
	

}
