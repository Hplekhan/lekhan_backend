package com.excel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.excel.demo.constant.NoEmployeeFound.EMPLOYEE_ADDED_MESSAGE;
import com.excel.demo.entity.EmployeeDto;
import com.excel.demo.response.CommanResponse;
import com.excel.demo.service.EmployeeService;

@RestController
public class DemoController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") int id) {
		EmployeeDto employee = employeeService.getEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<EmployeeDto>> findAllEmployees() {
		List<EmployeeDto> emp=employeeService.getAllEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(emp);

	}

	@PostMapping("/add")
	public ResponseEntity<CommanResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee){
		System.out.println(employee.getFirstName()+" "+employee.getLastName()
		+" "+employee.getMobiloeNo()+" "+employee.getAdhaarNo());
		EmployeeDto dto	=employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(CommanResponse.<EmployeeDto>builder().data(dto)
				.isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());

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

	@PutMapping("/updtae/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto dto, @PathVariable Integer id) {    
		EmployeeDto updatedEmp =   employeeService.updateEmployee(dto, id);  
		return ResponseEntity.status(HttpStatus.OK).body(updatedEmp);
	}



}

