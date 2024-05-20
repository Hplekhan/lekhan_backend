package com.excel.lms.dto;

import java.time.LocalDate;

import com.excel.lms.enums.Designation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExperienceDto {
	private int experience_id;
	
	private String employeeId;
	
	private String companyName;
	
	private LocalDate dateOfJoining;
	
	private LocalDate dateOfReliving;
	
	private Double yearOfExperience;
	
	private Designation designation;
	
	private String location;

}
