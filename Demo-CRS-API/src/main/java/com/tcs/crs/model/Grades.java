package com.tcs.crs.model;

public class Grades {
	
	private float grade;
	private int studentId;
	
	
	public Grades(float grade, int studentId) {
		super();
		this.grade = grade;
		this.studentId = studentId;
	}

	public Grades()
	{
		
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
	

}