/**
 * 
 */
package com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Repository;

import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.model.Student;

/**
 * @author nam
 *
 */
@Repository
public class StudentRepoImpl implements StudentRepo {
	
	private List<Student> students;

	public StudentRepoImpl() {
		students = new ArrayList<>();
	}
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void save(Student student) {
		students.add(student);
		
	}

}
