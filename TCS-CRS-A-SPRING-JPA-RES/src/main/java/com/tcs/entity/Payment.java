package com.tcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author springuser18
 *
 */
@Entity
@Table(name = "payment")

public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer paymentid;
	@Column(name = "paymentid")
	private Integer studentid;
	@Column(name = "referenceid")
	private Integer referenceid;
	@Column(name = "paymentmode")
	private String paymentmode;
	
	
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getReferenceid() {
		return referenceid;
	}
	public void setReferenceid(Integer referenceid) {
		this.referenceid = referenceid;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public Integer getPaymentid() {
		return paymentid;
	}
	
	
	
	@Override
	public String toString() {
		return "Payment [studentid=" + studentid + ", referenceid=" + referenceid + ", paymentmode=" + paymentmode
				+ ", paymentid=" + paymentid + "]";
	}

}
