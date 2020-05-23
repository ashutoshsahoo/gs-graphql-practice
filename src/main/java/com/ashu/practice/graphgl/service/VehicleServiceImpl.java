package com.ashu.practice.graphgl.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ashu.practice.graphgl.entity.Vehicle;
import com.ashu.practice.graphgl.repository.VehicleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

	private final VehicleRepository vehicleRepository;

	@Override
	public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
			final String launchDate) {
		Vehicle vehicle = Vehicle.builder().type(type).modelCode(modelCode).brandName(brandName)
				.launchDate(LocalDate.parse(launchDate)).build();
		return vehicleRepository.save(vehicle);
	}

	@Override
	public List<Vehicle> getAllVehicles(int count) {
		return vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
	}

	@Override
	public Optional<Vehicle> getVehicle(Long id) {
		return vehicleRepository.findById(id);
	}

}
