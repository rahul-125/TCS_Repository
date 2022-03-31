/**
 * 
 */
package com.tcs.model;

import java.io.Serializable;

/**
 * @author springuser18
 *
 */
public class CourseCatalog implements Serializable {

	private String coursecatalog;

	public CourseCatalog(String coursecatalog) {
		super();
		this.coursecatalog = coursecatalog;
	}
	
	
	public CourseCatalog()
	{
		
	}


	/**
	 * @return the coursecatalog
	 */
	public String getCourseCatalog() {
		return coursecatalog;
	}


	/**
	 * @param coursecatalog the coursecatalog to set
	 */
	public void setCourseCatalog(String coursecatalog) {
		this.coursecatalog = coursecatalog;
	}
	
	
	//toString to be used...
}