package com.excel.demo.service;

import java.util.List;

import com.excel.demo.entity.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto addEmployee(EmployeeDto dto);
	
	public boolean deleteEmployee(int id);
	
	public EmployeeDto getEmployee(int id);
	
	public List<EmployeeDto> getAllEmployee();
	
	

}

/**/
