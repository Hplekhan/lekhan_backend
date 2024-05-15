package com.excel.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.demo.Repo.EmployeeRepo;
import com.excel.demo.entity.Employee;
import com.excel.demo.entity.EmployeeDto;

@Service
public class  EmployeeServiceImpl  implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	//	List<Employee> employees = new ArrayList<>();

	/*To insert */
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee emp = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName()).adhaarNo(dto.getAdhaarNo()).mobiloeNo(dto.getMobiloeNo())
				.panNo(dto.getPanNo()).employeeNo(dto.getEmployeeNo()).build();

		Employee save = employeeRepo.save(emp);

		//		emp.setId((int) (Math.random()*10));
		//		employees.add(emp);

		return EmployeeDto.builder().id(save.getId()).firstName(save.getFirstName()).lastName(save.getLastName()).adhaarNo(save.getAdhaarNo())
				.mobiloeNo(save.getMobiloeNo()).panNo(save.getPanNo()).employeeNo(save.getEmployeeNo()).build();
	}

	/*Particular id to delete*/
	@Override
	public boolean deleteEmployee(int id) {
		if(employeeRepo.existsById(id)) {
			employeeRepo.deleteById(id);
			return true;
		}
		else {
			return false;
		}

	}
	/*GetEmployees by id*/
	@Override
	public EmployeeDto getEmployee(int id) {
		if( employeeRepo.findById(id) == null){
			System.out.println("Id Not found");
		};
		return (EmployeeDto) employeeRepo;
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

//	/*GetAll Employees*/
//	@Override
//	public List<EmployeeDto> getAllEmployee() {
//		List<EmployeeDto> getAllEmp = (employeeRepo.findAll();
//		return getAllEmp;
//	}

	






}
