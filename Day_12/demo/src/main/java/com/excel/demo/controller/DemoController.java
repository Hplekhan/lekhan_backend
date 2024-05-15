package com.excel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.entity.Employee;
import com.excel.demo.entity.EmployeeDto;
import com.excel.demo.service.EmployeeService;

@RestController
public class DemoController {

	@Autowired
	private EmployeeService employeeService;



//	@GetMapping("/get/{id}")
//	public ResponseEntity<String> getEmployee(@PathVariable("id") int id){
//		Employee employee = employeeService.getEmployee(id);
//		
//		if(getStudent) {
//			return ResponseEntity.status(HttpStatus.OK).body("Employee ID details :"+id+" "+(Object)getStudent);
//		}
//		else {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee ID details  : " + id + " not found.");
//		}
//		
//	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") int id) {
	    EmployeeDto employee = employeeService.getEmployee(id);
	    
	    if (employee != null) {
	        return ResponseEntity.status(HttpStatus.OK).body(employee);
	    } else {
	        System.out.println("Not found");
	    }
		return null;
	}
	
	
//	 @GetMapping("/employees")
//	    public List<Employee> getAllEmployees() {
//	        return (List<Employee>) employeeService.getAllEmployee();
//	    }

	@PostMapping("/add")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee){
		System.out.println(employee.getFirstName()+" "+employee.getLastName()
		+" "+employee.getMobiloeNo()+" "+employee.getAdhaarNo());
		EmployeeDto dto	=employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(dto);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id) {
		boolean deleted = employeeService.deleteEmployee(id);

		if (deleted) {
			return ResponseEntity.status(HttpStatus.OK).body("Employee ID : " + id + " deleted successfully.");
		} 
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee ID : " + id + " not found.");
		}
	}
	
	
}

