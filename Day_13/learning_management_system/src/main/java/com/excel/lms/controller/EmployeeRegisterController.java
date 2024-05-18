package com.excel.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static  com.excel.lms.custom_response.EmployeeException.EMPLOYEE_ADDED_MESSAGE;
import com.excel.lms.Response.CommonResponse;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
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

}
