package com.excel.lms.util;

import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;

public class ObjectUtils {

	public static EmployeePrimaryInfo dtoToEntity(PrimaryEmployeeDto dto) {

		return EmployeePrimaryInfo.builder().employeeId(dto.getEmployeeId()).employeeName(dto.getEmployeeName()).dateOfJoining(dto.getDateOfJoining()).dateOfBirth(dto.getDateOfBirth())
				.bloodGroup(dto.getBloodGroup()).email(dto.getEmail()).designation(dto.getDesignation()).gender(dto.getGender())
				.gender(dto.getGender()).nationality(dto.getNationality()).employeeStatus(dto.getEmployeeStatus()).build();
	}
	
	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto dto) {

		return EmployeeSecondaryInfo.builder().panNo(dto.getPanNo()).AadharNo(dto.getAadharNo()).fatherName(dto.getFatherName())
				.motherName(dto.getMotherName()).spouseName(dto.getSpouseName()).martialStatus(dto.getMartialStatus()).passportNo(dto.getPassportNo())
				.build();
	}
	
	public static BankDetails dtoToEntity(BankDetailsDto dto) {

		return BankDetails.builder().accountNo(dto.getAccountNo()).bankName(dto.getBankName()).accouontType(dto.getAccouontType())
				.ifscCode(dto.getIfscCode()).branch(dto.getBranch()).state(dto.getState()).build();
	}
}

