package com.tcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.service.CustomerInterfaceImpl;

@Configuration
public class CustomerAppConfig {

	@Bean(name="helloBean")
	public CustomerInterfaceImpl customer()
 {return new CustomerInterfaceImpl();
 }
 }
