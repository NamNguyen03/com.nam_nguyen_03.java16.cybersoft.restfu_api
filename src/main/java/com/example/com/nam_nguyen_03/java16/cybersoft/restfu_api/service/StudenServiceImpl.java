/**
 * 
 */
package com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.model.Student;
import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.repository.StudentRepo;

/**
 * @author nam
 *
 */
@Service
public class StudenServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> save(Student student) {
		studentRepo.save(student);
		
		return studentRepo.getAll();
	}

}
