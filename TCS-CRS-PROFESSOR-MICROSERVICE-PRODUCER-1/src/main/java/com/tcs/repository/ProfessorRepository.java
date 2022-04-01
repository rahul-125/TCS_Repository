/**
 * 
 */
package com.tcs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tcs.entity.Professor;

/**
 * @author springuser18
 *
 */
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
	

}