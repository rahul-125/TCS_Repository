package com.tcs.repository;

/**
* @author springuser18
*
*/
import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Payment;



public interface PaymentRepository<P> extends CrudRepository<Payment, Integer> {
	// This PaymentRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll() 

}