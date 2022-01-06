package com.project.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.student.entities.StudentEntity;
import com.project.student.repos.StudentRepository;

@SpringBootTest
class StudentApplicationTests {

	@Autowired
	private StudentRepository repo;
	
	@Test
	void createStudent() {
		StudentEntity student=new StudentEntity();
		student.setCourse("CS");
		student.setName("Ayla");
		student.setFee(25000d);
		repo.save(student);
	}

}
