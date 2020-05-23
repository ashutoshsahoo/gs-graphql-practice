package com.ashu.practice.graphgl.service;

import java.util.List;
import java.util.Optional;

import com.ashu.practice.graphgl.entity.Vehicle;

public interface VehicleService {

	Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate);

	List<Vehicle> getAllVehicles(final int count);

	Optional<Vehicle> getVehicle(final Long id);
}
