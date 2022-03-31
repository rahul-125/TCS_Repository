package com.tcs.crs.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.tcs.crs.model.Courses;
import com.tcs.crs.model.Grades;
import com.tcs.crs.model.PayFee;
import com.tcs.crs.model.Student;
import com.tcs.crs.service.CrsFuntionalities;
import com.tcs.crs.service.CrsFuntionalitiesImpl;

@Repository
public class StudentDAO {
	
	 private static AtomicInteger i = new AtomicInteger(0);
	 private  int a;
	
	private static List<Student> students;
	{
		students = new ArrayList();
	}
	
	private static List<Courses> courses;
	{
		courses = new ArrayList();
	}
	
	private static List<Grades> grades;
	{
		grades = new ArrayList();
	}

	private static List<PayFee> fees;
	{
		fees = new ArrayList();
	}

	
	/*
	 * Register Student Details
	 * @Param student
	 * @Throws
	 */
	public   String register(Student student) {
		
		
			student.setId(a);
			students.add(student);
			return "Successful";
			
	}


	
	/*
	 * Add Course Details
	 * @Param course
	 * @Throws
	 */
	
	public String addcourse(Courses course) 
	{
	
		courses.add(course);
		return "Successful";
		
	}
	
	/*
	 * Delete Course Details
	 * @Param courseId
	 * @Throws
	 */

	public String deletecourse(int courseId) 
	{
		
		for(Courses c: courses)
		{
			if(c.getCourseId()== courseId)
			{
				courses.remove(c);
			}
			
			else 
				return "Unsuccessful";
		}
		
		return "Successful";
		
	}
	
	/*
	 * View Grade Details
	 * @Param id
	 * @Throws
	 */

	public float viewgrades(int id) 
	{
		
		for (Grades g: grades)
		{
			if(g.getStudentId()== id)
			{
				return g.getGrade();
			}
			
			
		}
		
		return 0;
	}

	/*
	 * Payment Details
	 * @Param fee
	 * @Throws
	 */

	public String PayFee(PayFee fee) 
	
	{
		fee.setTransactionId(System.currentTimeMillis());
		fees.add(fee);
		return "Successful";
		
	}


	
	/*
	 * View Courses
	 * @Param course
	 * @Throws
	 */

	public List viewCourse(Courses course) 
	
	{
		
		return courses;
		
	}

	

}