/**
 * 
 */
package com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.repository;

import java.util.List;

import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.model.Student;

/**
 * @author nam
 *
 */
public interface StudentRepo {

	/**
	 * get all student
	 * 
	 * @return List<Student> 
	 */
	List<Student> getAll();

	/**
	 * save student
	 * 
	 * @param student
	 */
	void save(Student student);

}
