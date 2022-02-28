/**
 * 
 */
package com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.service;

import java.util.List;

import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.model.Student;

/**
 * @author nam
 *
 */
public interface StudentService {

	/**
	 * add user
	 * 
	 * @param student
	 * @return List<Student> 
	 */
	List<Student> save(Student student);
	
}
