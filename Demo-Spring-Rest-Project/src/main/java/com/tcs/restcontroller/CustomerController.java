/**
 * 
 */
package com.tcs.restcontroller;


import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.model.Customer;
/**
 * @author springuser18
 *
 */
@RestController
public class CustomerController {
	@RequestMapping(method = RequestMethod.GET,value = "/helloWorld")
	public String helloWorld() {
		
		
		return "hello World";
	}
	

	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/details")	
	
		@ResponseBody
	 public Customer details(){
		
		Customer c1=new Customer();
		c1.setCustomerId (101);
		c1.setCustomerName("XYZ");
		c1.setCustomerAddress("abc");
			
		
		return c1;
		   
	}

}

