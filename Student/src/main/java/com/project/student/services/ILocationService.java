package com.project.student.services;

import java.util.List;

import com.project.student.entities.LocationEntity;

public interface ILocationService {
	LocationEntity saveLocation(LocationEntity location);

	LocationEntity updateLocation(LocationEntity location);

	void deleteLocation(LocationEntity location);

	

	List<LocationEntity> getAllLocations();

	LocationEntity getLocationById(Long id);
}
