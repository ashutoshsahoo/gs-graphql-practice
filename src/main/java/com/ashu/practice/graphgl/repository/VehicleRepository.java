package com.ashu.practice.graphgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.practice.graphgl.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
