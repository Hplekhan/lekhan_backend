package com.excel.demo.util;

import com.excel.demo.entity.Employee;
import com.excel.demo.entity.EmployeeDto;

public class EmployeeUtil {
	private EmployeeUtil() {

	}

	public static EmployeeDto employeeToDto(Employee employee) {
		return EmployeeDto.builder().id(employee.getId()).firstName(employee.getFirstName()).lastName(employee.getLastName())
				.mobiloeNo(employee.getMobiloeNo()).adhaarNo(employee.getAdhaarNo()).panNo(employee.getPanNo())
				.employeeNo(employee.getEmployeeNo()).build();

	}
}

