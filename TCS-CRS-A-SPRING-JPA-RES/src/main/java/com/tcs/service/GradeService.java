package com.tcs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import com.tcs.entity.Grade;

import com.tcs.repository.GradeRepository;

/**
 * @author springuser18
 *
 */
public class GradeService {

@Autowired
	

	GradeRepository<Grade> grade;
	@Transactional
	public boolean Viewgrade (Grade gr) {
		return Grade.find(gr) != null;
	}
		
	}