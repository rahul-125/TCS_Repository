/**
 * 
 */
package com.tcs.repository;
import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Person;

import java.util.List;
/**
 * @author springuser18
 *
 */
public interface PersonRepository<P> extends CrudRepository<Person, Long> {
	// This PersonRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll()
	List<Person> findByFirstName(String firstName);
}