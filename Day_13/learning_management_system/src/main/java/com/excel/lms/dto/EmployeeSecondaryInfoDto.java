package com.excel.lms.dto;
import com.excel.lms.enums.MartialStatus;

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
public class EmployeeSecondaryInfoDto {
	
	private String employeeId;
	
	private String panNo ;
	
	private String AadharNo;
	
	private String fatherName;
	
	private String motherName;
	
	private String spouseName;
	
	private String passportNo;
	
	private MartialStatus martialStatus;

}
