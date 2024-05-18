package com.excel.lms.dto;

import com.excel.lms.enums.EducationType;

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
public class EducationalDetailsDto {

	private int  education_id;

	private EducationType educationType;

	private double percentage;

	private String instituteName;

	private String state;

	private String universityName;

	private String specialization;

	private double yearOfPassing;
}
