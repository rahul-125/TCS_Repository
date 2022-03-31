package com.tcs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.tcs.entity.Payment;

import com.tcs.repository.PaymentRepository;

/**
 * @author springuser18
 *
 */
public class PaymentService {
@Autowired
	

	PaymentRepository<Payment> Payment;
	@Transactional
	public boolean addPayment (Payment py) {
		return Payment.save(py) != null;
	}
	


}
