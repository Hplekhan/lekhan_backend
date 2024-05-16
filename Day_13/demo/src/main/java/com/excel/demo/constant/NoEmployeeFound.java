package com.excel.demo.constant;

public class NoEmployeeFound extends RuntimeException {
	
	public NoEmployeeFound(String message) {
		super(message);
	}
	
	public static final String Employee_deleted_sucessfully = "employee deleted sucess";
	
	public static final String No_Employee_found = "no employee found on this id";
	
	public static final String EMPLOYEE_ADDED_MESSAGE ="Sucessfully Added..!";

}
