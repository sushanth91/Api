package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Student;
import com.api.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	private StudentService studentSer;
	
	@PostMapping
	public void save(@RequestBody Student student) {
		studentSer.saveStudent(student);
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student)   {  
		studentSer.updateStudent(student);
		} 
	
	@DeleteMapping
	public void deleteById(long id)   
	{  
		studentSer.deleteById(id);  
	}  
	
}
