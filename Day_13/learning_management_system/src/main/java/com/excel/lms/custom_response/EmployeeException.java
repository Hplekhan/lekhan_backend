package com.excel.lms.custom_response;

public class EmployeeException extends RuntimeException  {

	public EmployeeException(String message) {
		super(message);
	}

	public static final String Employee_deleted_sucessfully = "employee deleted sucess";

	public static final String No_Employee_found = "no employee found on this id";

	public static final String EMPLOYEE_ADDED_MESSAGE ="Sucessfully Added..!";

}



