package com.excel.demo.service;

/*Custom exception we made in seperate class*/
/*we need to make static in  import & need to call that method*/
import static  com.excel.demo.constant.NoEmployeeFound.No_Employee_found;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.demo.constant.NoEmployeeFound;
import com.excel.demo.customException.EmployeeException;
import com.excel.demo.entity.Employee;
import com.excel.demo.entity.EmployeeDto;
import com.excel.demo.repo.EmployeeRepo;
import com.excel.demo.util.EmployeeUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class  EmployeeServiceImpl  implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	

	/*To insert */
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee emp = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName()).adhaarNo(dto.getAdhaarNo()).mobiloeNo(dto.getMobiloeNo())
				.panNo(dto.getPanNo()).employeeNo(dto.getEmployeeNo()).build();

		Employee save = employeeRepo.save(emp);

		/*Either this return type or using util class can also perform same */
		/*return EmployeeDto.builder().id(save.getId()).firstName(save.getFirstName()).lastName(save.getLastName()).adhaarNo(save.getAdhaarNo())
				.mobiloeNo(save.getMobiloeNo()).panNo(save.getPanNo()).employeeNo(save.getEmployeeNo()).build();*/
		return EmployeeUtil.employeeToDto(emp);
	}

	/*Particular id to delete*/
	@Override
	public boolean deleteEmployee(int id) {
		if(employeeRepo.existsById(id)) {
			employeeRepo.deleteById(id);
			return true;
		}
		/*this is custom exception we made*/
		else {
			 throw new NoEmployeeFound(No_Employee_found);		
			 }

	}
	/*GetEmployees by id*/
	@Override
	public EmployeeDto getEmployee(int id) {
		try {
			Optional<Employee> SingleEmployee = employeeRepo.findById(id);
			if(SingleEmployee.isPresent()) {
				Employee emp = SingleEmployee.get();
				return EmployeeUtil.employeeToDto(emp);
			}
			throw new EmployeeException("Employee Not forund with ID :"+id);
		}
		catch (EmployeeException e) {
			throw e;
		}
		catch (Exception e) {
			log.error("some issue while fetching");
		}
		return null;
	}
	/*Get AllEmployees*/
	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<Employee> fetchEmployees = (List<Employee>) employeeRepo.findAll();
		return fetchEmployees.stream().map(e -> EmployeeDto.builder().id(e.getId()).firstName(e.getFirstName()).lastName(e.getLastName()).adhaarNo(e.getAdhaarNo())
				.mobiloeNo(e.getMobiloeNo()).panNo(e.getPanNo()).employeeNo(e.getEmployeeNo()).build()).toList();
		
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto dto, Integer id) {
		Optional<Employee> getId = employeeRepo.findById(id);
		if(getId.isPresent()) {
			Employee emp  =  getId.get();
			  log.info(dto.getFirstName());
			  emp.setFirstName(dto.getFirstName());
			  emp.setLastName(dto.getLastName());
			  Employee updatedEmployee = employeeRepo.save(emp);
			   return EmployeeUtil.employeeToDto(updatedEmployee);
		}
//		throw new EmployeeException("Employee Not forund with ID :"+id)
		else {
			throw new NoEmployeeFound(No_Employee_found);
		}
		
	}
}
