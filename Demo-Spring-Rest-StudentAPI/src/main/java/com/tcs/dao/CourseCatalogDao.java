
package com.tcs.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.model.CourseCatalog;
/**
 * @author springuser18
 *
 */
/**
 * Implementation for coursecatalog
 * @param 
 *
 */
private static List<CourseCatalog> CourseCatalogDao;
{
	coursecatalog = new ArrayList();
	coursecatalog.add(new CourseCatalog("math"));
	coursecatalog.add(new CourseCatalog("science"));
	coursecatalog.add(new CourseCatalog("english"));
}

/**
 * List of course implementation
 * @param 
 *
 */
public List list1() {
	return coursecatalog;
}
/**
 * Get the details for specific course
 * @param 
 *
 */


public CourseCatalog get(String course) {

	for (CourseCatalog e : coursecatalog) {
		if (e.getCourseCatalog().equals(course)) {
			return e;
		}
	}
	return null;
}
/**
 * Add CourseCatalog
 * @param 
 *
 */

public CourseCatalog create(CourseCatalog course) {
	//course.setCourseCatalog(coursecatalog);(System.currentTimeMillis());
	coursecatalog.add(course);
	return course;

}
/**
 * Delete Course
 * @param 
 *
 */


public String delete(String course) {

	for (CourseCatalog c : coursecatalog) {
		if (c.getCourseCatalog().equals(course)) {
			coursecatalog.remove(c);
			return course;
			
		}
	}
	return null;
}

/**
 * GRADES LIST
 * @param 
 *
 */

/*    //Get the Grade details with 

public Grade get(float grade) {

	for (Grade e : grades) {
		if (e.getGrade().equals(grade)) {
			return e;
		}
	}
	return null;
}

*/
}
