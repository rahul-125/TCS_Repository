package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Student;
import com.tcs.repository.StudentRepository;



@Service
public class StudentService {

	@Autowired
	static
	StudentRepository<Student> studentRepository;
	public static boolean addStudent (Student student) {
		return studentRepository.save(student) != null;
	}
	

}