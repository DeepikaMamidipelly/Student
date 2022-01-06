package com.project.student.repos;

import org.springframework.data.repository.CrudRepository;

import com.project.student.entities.LocationEntity;

public interface LocationRepo extends CrudRepository<LocationEntity, Long> {

}
