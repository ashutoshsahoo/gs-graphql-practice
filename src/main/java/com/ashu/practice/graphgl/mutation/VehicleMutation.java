package com.ashu.practice.graphgl.mutation;

import org.springframework.stereotype.Component;

import com.ashu.practice.graphgl.entity.Vehicle;
import com.ashu.practice.graphgl.service.VehicleService;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class VehicleMutation implements GraphQLMutationResolver {

	private final VehicleService vehicleService;

	public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
			final String launchDate) {
		return vehicleService.createVehicle(type, modelCode, brandName, launchDate);
	}
}
