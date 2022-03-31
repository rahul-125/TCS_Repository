package com.tcs.repository;

/**
 * @author springuser18
 *
 */
import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Course;
import com.tcs.entity.CourseEnrolled;
import com.tcs.entity.Student;



public interface CourseEnrolledRepository<P> extends CrudRepository<CourseEnrolledRepository, Integer> {

	public boolean addCourseEnrolled (CourseEnrolled ce); 
	// This CourseEnrolledRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll() 

	public Integer save(Course courseid);
	
}

