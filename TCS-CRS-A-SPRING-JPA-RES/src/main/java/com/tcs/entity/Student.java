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
@Table(name = "student")


public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer studentid;
	@Column(name = "studentname")
	private String studentname;
	@Column(name = "studentemail")
	private String studentemail;
	@Column(name = "studentphone")
	private Integer studentphone;
	@Column(name = "cousreid")
	private Integer courseid;
	
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public Integer getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(Integer studentphone) {
		this.studentphone = studentphone;
	}
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", studentphone=" + studentphone + ", courseid=" + courseid + "]";
	}
}