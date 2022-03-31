package com.tcs.repository;

/**
 * @author springuser18
 *
 */
import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Course;



public interface CourseRepository<P> extends CrudRepository<Course, Integer> {
	// This CourseRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll() 
}