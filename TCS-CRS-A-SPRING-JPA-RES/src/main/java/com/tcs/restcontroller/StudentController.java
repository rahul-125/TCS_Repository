package com.tcs.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Student;
import com.tcs.service.StudentService;




/**
 * @author springuser18
 *
 */
@RestController
public class StudentController {

	@Autowired
	StudentService studentservice;
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody Student student) {
		return studentservice.addStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;

		
	}
}