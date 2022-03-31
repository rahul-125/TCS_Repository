package com.tcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.tcs.configuration.AppConfig;
import com.tcs.service.CustomerInterface;
import com.tcs.service.HelloWorld;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@Import({AppConfig.class})
@EnableAutoConfiguration
public class DemoSpringCoreApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(DemoSpringCoreApplication.class, args);
	//System.out.println("this is a demo java projuct");
	
	ApplicationContext context=SpringApplication.run(AppConfig.class);
	 
	CustomerInterface obj1 = (CustomerInterface) context.getBean("helloBean1");
    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
    
    obj.printHelloWorld("Spring5 java Config demo to invoke the service");
    obj1.addCustomer();
    obj1.show();
    obj1.delete();
	
	}
	
}
