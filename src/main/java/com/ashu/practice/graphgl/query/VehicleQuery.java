package com.ashu.practice.graphgl.query;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ashu.practice.graphgl.entity.Vehicle;
import com.ashu.practice.graphgl.service.VehicleService;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class VehicleQuery implements GraphQLQueryResolver {

	private final VehicleService vehicleService;

	public List<Vehicle> getVehicles(final int count) {
		return vehicleService.getAllVehicles(count);
	}

	public Optional<Vehicle> getVehicle(final Long id) {
		return vehicleService.getVehicle(id);
	}
}
