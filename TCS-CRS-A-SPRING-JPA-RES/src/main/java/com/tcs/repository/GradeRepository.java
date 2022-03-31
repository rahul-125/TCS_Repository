package com.tcs.repository;

/**
 * @author springuser18
 *
 */
import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Grade;

import java.util.List;

public interface GradeRepository<P> extends CrudRepository<Grade, Integer> {
	// This GradeRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll() 

	
}