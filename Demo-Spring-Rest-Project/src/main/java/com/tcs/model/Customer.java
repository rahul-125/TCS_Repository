/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser18
 *
 */
public class Customer {
private int customerId;
private String customerName;
private String customerAddress;


public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
}
