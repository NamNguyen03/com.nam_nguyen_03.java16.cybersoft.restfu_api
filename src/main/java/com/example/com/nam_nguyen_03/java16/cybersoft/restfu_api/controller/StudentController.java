/**
 * 
 */
package com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.model.Student;
import com.example.com.nam_nguyen_03.java16.cybersoft.restfu_api.service.StudentService;

/**
 * @author nam
 *
 */
@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/param")
	public List<Student> addUserByParam(
			@RequestParam("name") String name,
			@RequestParam("age") int age){
		
		return studentService.save(new Student(name, age));
	}
	
	@PostMapping("/path/{name}/{age}")
	public List<Student> addUserByPath(
			@PathVariable("name") String name,
			@PathVariable("age") int age){
		
		return studentService.save(new Student(name, age));
	}
	
	@PostMapping("/body")
	public List<Student> addUserByBody(@RequestBody Student student	){
		
		return studentService.save(student);
	}
}
