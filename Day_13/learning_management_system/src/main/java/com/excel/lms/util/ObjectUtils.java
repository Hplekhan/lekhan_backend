package com.excel.lms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excel.lms.dto.AddressInfoDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactInfoDto;
import com.excel.lms.dto.EducationalDetailsDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
import com.excel.lms.dto.TechnicalSkillsDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.ContactInfo;
import com.excel.lms.entity.EducationalDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.Experience;
import com.excel.lms.entity.TechnicalSkills;

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
	
	public static List<EducationalDetails> educationDtoToEntity(List<EducationalDetailsDto> dtoList) {
		return dtoList.stream()
				.map(edu -> EducationalDetails.builder().educationType(edu.getEducationType()).percentage(edu.getPercentage()).instituteName(edu.getInstituteName())
						.state(edu.getState()).universityName(edu.getUniversityName()).specialization(edu.getSpecialization()).yearOfPassing(edu.getYearOfPassing()).build()).collect(Collectors.toList());
	}
	
	public static List<AddressDetails> addressDtoToEntity(List<AddressInfoDto> dtoList) {
		return dtoList.stream()
				.map(edu -> AddressDetails.builder().addressType(edu.getAddressType()).doorNo(edu.getDoorNo()).street(edu.getStreet())
						.locality(edu.getLocality()).city(edu.getCity()).state(edu.getState()).pinCode(edu.getPinCode())
						.landMark(edu.getLandMark()).build()).collect(Collectors.toList());
	}

	public static List<Experience> dtoToEntity(List<ExperienceDto> dtoToList) {
		return dtoToList.stream()
				.map(edu -> Experience.builder().companyName(edu.getCompanyName()).dateOfJoining(edu.getDateOfJoining())
						.dateOfReliving(edu.getDateOfReliving()).yearOfExperience(edu.getYearOfExperience())
						.designation(edu.getDesignation()).location(edu.getLocation())
						.build()).collect(Collectors.toList());
	}
	
	public static List<ContactInfo> contactDtoToEntity(List<ContactInfoDto> dtoToList) {
		return dtoToList.stream()
				.map(e -> ContactInfo.builder().contactType(e.getContactType()).contactNumber(e.getContactNumber())
						.build()).collect(Collectors.toList());
	}
	
	public static TechnicalSkills technicalDtoToEntity(TechnicalSkillsDto dto) {
		return TechnicalSkills.builder()
				.skillType(dto.getSkillType())
				.skillRating(dto.getSkillRating())
				.yearOfExperience(dto.getYearOfExperience()).listOfSkills(new ArrayList<>()).build();
						
	}

}

