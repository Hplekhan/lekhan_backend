package com.excel.lms.service;

import com.excel.lms.dto.AddressInfoListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactInfoListDto;
import com.excel.lms.dto.EducationalInfoList;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
import com.excel.lms.dto.TechnicalSkillsListDto;

public interface EmployeeService {
	
	public String addEmployee(PrimaryEmployeeDto dto);
	
	public String saveSecondaryEmpInfo(EmployeeSecondaryInfoDto dto);
	
	public String addBankDetails(BankDetailsDto dto);
	
	public String addEducationDetails(EducationalInfoList dto);
	
	public String addAddressInfo(AddressInfoListDto dto);
	
	public String addExperienceInfo(ExperienceListDto dto);
	
	public String addContactInfo(ContactInfoListDto dto);
	
	public String saveTechnicalSkills(TechnicalSkillsListDto dto);
	
}
