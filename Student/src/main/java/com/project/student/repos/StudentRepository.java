package com.project.student.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.project.student.entities.StudentEntity;

@Component
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

}
