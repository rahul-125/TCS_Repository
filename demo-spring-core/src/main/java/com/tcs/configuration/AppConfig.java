package com.tcs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;


@Configuration
@Import({CustomerAppConfig.class})
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
	
}