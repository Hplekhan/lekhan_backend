package com.excel.lms.service;

import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.PrimaryEmployeeDto;

public interface EmployeeService {
	
	public String addEmployee(PrimaryEmployeeDto dto);
	
	public String saveSecondaryEmpInfo(EmployeeSecondaryInfoDto dto);
	
	public String addBankDetails(BankDetailsDto dto);
	
}
