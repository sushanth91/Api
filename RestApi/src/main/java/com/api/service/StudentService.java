package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Student;
import com.api.reopo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;

	public void saveStudent(Student student) {
		repo.save(student);
	}
	
	public void updateStudent(Student student)   {  
		repo.save(student);
		} 
	
	public void deleteById(long id)   
	{  
	repo.deleteById(id);  
	}  
	

}
