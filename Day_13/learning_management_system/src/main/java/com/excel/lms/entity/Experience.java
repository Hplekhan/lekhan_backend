package com.excel.lms.entity;

import java.time.LocalDate;
import java.time.Year;

import com.excel.lms.enums.Designation;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee_experience_info")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int experience_id;
	
	private String companyName;
	
	private LocalDate dateOfJoining;
	
	private LocalDate dateOfReliving;
	
	private double yearOfExperience;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	private String location;

}
