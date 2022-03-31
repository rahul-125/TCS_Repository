package com.tcs.repository;

/**
 * @author springuser18
 *
 */
import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Student;

import java.util.List;

public interface StudentRepository<P> extends CrudRepository<Student, Integer> {
	// This StudentRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll() 
	
}
