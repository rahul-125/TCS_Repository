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
@Table(name = "courseenrolled")

public class CourseEnrolled {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer courseenrolled;
	@Column(name = "courseid")
	private Integer courseid;
	@Column(name = "studentid")
	private Integer studentid;
	
	public Integer getCourseenrolled() {
		return courseenrolled;
	}
	public void setCourseenrolled(Integer courseenrolled) {
		this.courseenrolled = courseenrolled;
	}
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	@Override
	public String toString() {
		return "CourseEnrolled [courseenrolled=" + courseenrolled + ", courseid=" + courseid + ", studentid="
				+ studentid + "]";
	}
}