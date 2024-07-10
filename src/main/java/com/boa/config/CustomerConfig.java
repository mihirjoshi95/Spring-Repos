package com.boa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.service.Customer;
import com.boa.service.CustomerImpl;
@Configuration
public class CustomerConfig {
	@Bean(name = "customerBean")
	public Customer customers(){
		return new CustomerImpl();
	}
}
