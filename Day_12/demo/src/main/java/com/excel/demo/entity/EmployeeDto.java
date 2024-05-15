package com.excel.demo.entity;

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
public class EmployeeDto {
	
	private Integer id;	
	private String  firstName;	
	private String lastName;	
	private String adhaarNo;
	private String panNo;	
	private String mobiloeNo;	
	private String employeeNo;
	

}
