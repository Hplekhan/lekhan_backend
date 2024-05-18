package com.excel.lms.entity;

import com.excel.lms.enums.MartialStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="employee_secondary_info")
public class EmployeeSecondaryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int secondary_id;
		
	private String panNo ;
	
	private String AadharNo;
	
	private String fatherName;
	
	private String motherName;
	
	private String spouseName;
	
	private String passportNo;
	
	@Enumerated(EnumType.STRING)
	private MartialStatus martialStatus;
	
	@JoinColumn(name ="employeeId")
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
	
	
	
	

}