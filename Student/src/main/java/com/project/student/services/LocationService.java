package com.project.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.student.entities.LocationEntity;
import com.project.student.repos.LocationRepo;

@Component
public class LocationService implements ILocationService {
	
	@Autowired
	private LocationRepo repo;

	@Override
	public LocationEntity saveLocation(LocationEntity location) {
		//
		return repo.save(location);
	}

	@Override
	public LocationEntity updateLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		return repo.save(location);
	}

	@Override
	public void deleteLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		repo.delete(location);
	}

	@Override
	public LocationEntity getLocationById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<LocationEntity> getAllLocations() {
		// TODO Auto-generated method stub
		return (List<LocationEntity>) repo.findAll();
	}

}
