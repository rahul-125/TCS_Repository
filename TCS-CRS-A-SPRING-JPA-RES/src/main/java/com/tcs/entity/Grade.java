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
@Table(name = "grades")
public class Grade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer gradeno;	
	@Column(name = "studentid")
	private Integer studentid;
	@Column(name = "courseid")
	private Integer courseid;
	@Column(name = "marks")
	private Integer marks;
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public Integer getGradeno() {
		return gradeno;
	}
	public void setGradeno(Integer gradeno) {
		this.gradeno = gradeno;
	}
	@Override
	public String toString() {
		return "Grade [studentid=" + studentid + ", courseid=" + courseid + ", marks=" + marks + "]";
	}
	public static Integer find(Grade gr) {
		// TODO Auto-generated method stub
		return null;
	}}