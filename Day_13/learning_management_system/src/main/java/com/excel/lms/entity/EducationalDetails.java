package com.excel.lms.entity;

import java.time.Year;

import com.excel.lms.enums.EducationType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name ="employee_educational_info")
public class EducationalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  education_id;
	
	@Enumerated(EnumType.STRING)
	private EducationType educationType;
	
	private double percentage;
	
	private String instituteName;
	
	private String state;
	
	private String universityName;
	
	private String specialization;
	
	private double yearOfPassing;
	
	@JoinColumn(name ="employeeId")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}