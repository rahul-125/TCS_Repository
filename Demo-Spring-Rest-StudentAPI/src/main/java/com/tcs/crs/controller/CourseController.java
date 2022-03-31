/**
 * 
 */
package com.tcs.crs.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.model.CourseCatalog;


@RestController
public class CourseController {
	@Autowired //The meaning of @Autowired is put the dependency injection at the Dao layer
	private CourseCatalog coursecatalogDAO;

	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/coursecatalog")
		@ResponseBody
		public List getCourseCatalog() {
		

		
		return coursecatalogDAO.list();
	}
	
	//Using this method get details by coursecatalog by id
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/coursecatalog/{id}")
		@ResponseBody
	public ResponseEntity getCustomer(@PathVariable("id") Long id) {

		CourseCatalog coursecatalog = coursecatalogDAO.get(id);
		if (coursecatalog == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(coursecatalog, HttpStatus.OK);
	}




//Using This Api to Post coursecatalog data
@RequestMapping(consumes = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.POST,
		    value = "/post/coursecatalog")
		@ResponseBody	
		public ResponseEntity createCustomer(@RequestBody CourseCatalog coursecatalog) {

		coursecatalogDAO.create(coursecatalog);

		return new ResponseEntity(coursecatalog, HttpStatus.OK);
	}
//This method is using to delete the coursecatalog
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.DELETE,
		    value = "/delete/coursecatalog/{id}")
		@ResponseBody	
	public ResponseEntity delete(@PathVariable Long id) {

		if (null == coursecatalogDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	
//This method is using to update the coursecatalog
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.PUT,
		    value = "/put/coursecatalog/{id}")
		@ResponseBody	
	public ResponseEntity updateCustomer(@PathVariable Long id, @RequestBody CourseCatalog coursecatalog) {

		coursecatalog = coursecatalogDAO.update(id, coursecatalog);

		if (null == coursecatalog) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(coursecatalog, HttpStatus.OK);
	}


}