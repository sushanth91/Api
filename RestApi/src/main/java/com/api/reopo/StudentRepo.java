package com.api.reopo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	

}
