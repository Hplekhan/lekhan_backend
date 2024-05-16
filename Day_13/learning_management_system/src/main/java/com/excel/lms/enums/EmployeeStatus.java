package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EmployeeStatus {

	ACTIVE("ACTIVE"),  TERMINATED("TERMINATED"),  ABSCOND("ABSCOND");

	private final String employeeStatus;
}
