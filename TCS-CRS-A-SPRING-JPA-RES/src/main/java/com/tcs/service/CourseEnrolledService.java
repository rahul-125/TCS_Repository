package com.tcs.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Course;
import com.tcs.entity.CourseEnrolled;
import com.tcs.entity.Student;
import com.tcs.repository.CourseEnrolledRepository;
import com.tcs.repository.StudentRepository;



/**
 * @author springuser18
 *
 */
@Service
public class CourseEnrolledService {

	@Autowired
	

	CourseEnrolledRepository<CourseEnrolled> coursenrolled;
	@Transactional
	public boolean addCourseEnrolled (Course ce) {
		return coursenrolled.save(ce) != null;
	}
	
	public void deleteCourseEnrolled (Integer courseid) {
		coursenrolled.deleteById(courseid);
	}
}