package com.tcs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tcs.entity.Course;

import com.tcs.repository.CourseEnrolledRepository;



@Service
public class CourseService {

	@Autowired
	

	CourseEnrolledRepository<Course> course;
	@Transactional
	public boolean addCourse (Course ce) {
		return course.save(ce) != null;
	}
	

	}