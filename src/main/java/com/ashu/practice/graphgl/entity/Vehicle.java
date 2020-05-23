package com.ashu.practice.graphgl.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1108726147127804533L;

	private static final String VEHICLE_ID_SEQUENCE = "VEHICLE_ID_SEQUENCE";

	@Id
	@SequenceGenerator(name = VEHICLE_ID_SEQUENCE, sequenceName = VEHICLE_ID_SEQUENCE, allocationSize = 1, initialValue = 1000)
	@GeneratedValue(generator = VEHICLE_ID_SEQUENCE)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "TYPE", nullable = false)
	private String type;

	@Column(name = "MODEL_CODE", nullable = false)
	private String modelCode;

	@Column(name = "BRAND_NAME")
	private String brandName;

	@Column(name = "LAUNCH_DATE")
	private LocalDate launchDate;

}