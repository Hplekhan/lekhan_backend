package com.excel.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static  com.excel.lms.custom_response.EmployeeException.EMPLOYEE_ADDED_MESSAGE;

import java.util.List;

import com.excel.lms.Response.CommonResponse;
import com.excel.lms.dto.AddressInfoListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactInfoListDto;
import com.excel.lms.dto.EducationalInfoList;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.service.EmployeeService;

@RestController
public class EmployeeRegisterController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(path = "/primifo")
	public ResponseEntity<CommonResponse<String>> postPrimaryInfo(@RequestBody PrimaryEmployeeDto dto){
		String addedEmployee = employeeService.addEmployee(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<String>builder().data(addedEmployee).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());
	}

	@PostMapping(path = "/sinfo")
	public ResponseEntity<CommonResponse<String>>postSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto){
		String savedEmployee =	employeeService.saveSecondaryEmpInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<String>builder().data(savedEmployee).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());
	}

	@PostMapping(path="/binfo")
	public ResponseEntity<CommonResponse<Object>> postBankInfo(@RequestBody BankDetailsDto dto){
		String savedDetails = employeeService.addBankDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.builder().data(savedDetails).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());
		
	}
	
	@PostMapping(path="/einfo")
	public ResponseEntity<CommonResponse<Object>> postEducationInfo(@RequestBody EducationalInfoList dto){
		String savedDetails = employeeService.addEducationDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.builder().data(savedDetails).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());
		
	}
	
	@PostMapping(path="/ainfo")
	public ResponseEntity<CommonResponse<Object>> postAddressInfo(@RequestBody AddressInfoListDto dto){
		String savedDetails = employeeService.addAddressInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.builder().data(savedDetails).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());
		
	}
	
	@PostMapping(path="/expinfo")
	public ResponseEntity<CommonResponse<Object>> postExperienceInfo(@RequestBody ExperienceListDto dto){
		String savedDetails = employeeService.addExperienceInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.builder().data(savedDetails).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());		
	}
	
	@PostMapping(path="/cinfo")
	public ResponseEntity<CommonResponse<Object>> postContactInfo(@RequestBody ContactInfoListDto dto){
		String savedDetails = employeeService.addContactInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.builder().data(savedDetails).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());		
	}

	@PostMapping(path="/skillinfo")
	public ResponseEntity<CommonResponse<Object>> postSkillsInfo(@RequestBody TechnicalSkillsListDto dto){
		String savedDetails = employeeService.saveTechnicalSkills(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.builder().data(savedDetails).isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());		
	}
}
