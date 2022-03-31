/**
 * 
 */
package com.tcs.dao;

/**
 * @author springuser18
 *
 */


	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Repository;

	import com.tcs.model.CourseCatalog;
	import com.tcs.model.Student;

	@Repository
	public class StudentDao {
		
		// Dummy database. Initialize with some dummy values.
			//Here is the all method using dummy values
				private static List<Student> students;
				{
					students = new ArrayList();
					students.add(new Student(10, "Ram", "Mishra", "ram@gmail.com", "121-232-3789", "Kolkata", "Science"));	
					students.add(new Student(11, "Sam", "Mondal", "sam@gmail.com", "567-232-3789", "Delhi", "Arts"));
					students.add(new Student(12, "Raja", "Pal", "raja@gmail.com", "121-890-3789", "Pune", "Commerce"));
				}
				
				/**
				 * List of Student Implementation 
				 * @param 
				 *
				 */
				
				public List list() {
					return students;
				}
				
				
				/**
				 * Get the Student details with id 
				 * @param 
				 *
				 */
				
				public Student get(Long id) {

					for (Student e : students) {
						if (e.getId().equals(id)) {
							return e;
						}
					}
					return null;
				}
				
				/**
				 * create student
				 * @param 
				 *
				 */
				public Student create(Student student) {
					//student.setId(System.currentTimeMillis());
					students.add(student);
					return student;
				}
				
				/**
				 * Delete Student from DB
				 * @param 
				 *
				 */
				
				public Long delete(Long id) {

					for (Student c : students) {
						if (c.getId().equals(id)) {
							students.remove(c);
							return id;
							
						}
					}
					return null;
		}
				
				/**
				 * Update student in DB 
				 * @param 
				 *
				 */
				public Student update(Long id, Student student) {

					for (Student c : students) {
						if (c.getId().equals(id)) {
							student.setId(c.getId());
							students.remove(c);
							students.add(student);
							return student;
						}
					}

					return null;
				}}