package com.tcs.crs.model;

public class Courses {

	private String courseName;
	private String description;
	private int courseId;
	
	
	public Courses(String courseName, String description, int courseId) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.courseId = courseId;
	}
	
	public Courses()
	{
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	//toString to be used...
}