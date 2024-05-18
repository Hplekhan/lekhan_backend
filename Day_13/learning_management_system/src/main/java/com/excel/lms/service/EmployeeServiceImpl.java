package com.excel.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.repo.EmployeeBankDetailsRepo;
import com.excel.lms.repo.EmployeeRepo;
import com.excel.lms.repo.EmployeeSecondaryRepo;
import com.excel.lms.util.ObjectUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeSecondaryRepo employeeSecondaryRepo;
	
	@Autowired
	private EmployeeBankDetailsRepo employeeBankDetailsRepo;

	@Override
	public String addEmployee(PrimaryEmployeeDto dto) {
		if(!employeeRepo.findByEmployeeId(dto.getEmployeeId() ).isPresent()) {

			EmployeePrimaryInfo emp = ObjectUtils.dtoToEntity(dto);

			EmployeePrimaryInfo employee = employeeRepo.save(emp);
			return employee.getEmployeeId();
		}
		return null;
	}

	@Override
	public String saveSecondaryEmpInfo(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optional  = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		
		if(optional.isPresent()) {
			  EmployeePrimaryInfo emp   = optional.get();
			  /*This if part is for saving*/
			  if(emp.getEmployeeSecondaryInfo() == null) {
				 EmployeeSecondaryInfo employeeSecondaryInfo = ObjectUtils.dtoToEntity(dto);				 
				 /*save to primaryEmployee*/
				 emp.setEmployeeSecondaryInfo(employeeSecondaryInfo);			 
				 /*again save to secondaryEmployee*/
				 employeeSecondaryInfo.setEmployeePrimaryInfo(emp);
				 /*here we save all data to PrimaryEmployee then get emp_id*/
				 return employeeRepo.save(emp).getEmployeeId();
			  }
			  /*This else part is only if we want to update any of field, it means not null */
			  else {
				  /*here we are getting from employeePrimaryInfo, if already data is stored*/
				 EmployeeSecondaryInfo secondaryInfo=  emp.getEmployeeSecondaryInfo();
				 /*here we are setting all fields*/
				 secondaryInfo.setPanNo(dto.getPanNo());
				 secondaryInfo.setAadharNo(dto.getAadharNo());
				 secondaryInfo.setFatherName(dto.getFatherName());
				 secondaryInfo.setMotherName(dto.getMotherName());
				 secondaryInfo.setMartialStatus(dto.getMartialStatus());
				 secondaryInfo.setPassportNo(dto.getPassportNo());
				 secondaryInfo.setSpouseName(dto.getSpouseName());
				 
				 return employeeRepo.save(emp).getEmployeeId();				 
			  }
		}	
		return null;
	}

	@Override
	public String addBankDetails(BankDetailsDto dto) {
		
		Optional<EmployeePrimaryInfo> byEmployeeId = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		
		if(byEmployeeId.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = byEmployeeId.get();
			/*this bank details comes from EmployeeprimaryDetails-->near instance of object(Bank)*/
			if(employeePrimaryInfo.getBankDetails() == null) {
				BankDetails details = ObjectUtils.dtoToEntity(dto);
				
				employeePrimaryInfo.setBankDetails(details);
				
				details.setEmployeePrimaryInfo(employeePrimaryInfo);
				return employeeRepo.save(employeePrimaryInfo).getEmployeeId();
			}
			else {
				BankDetails bankDetails = employeePrimaryInfo.getBankDetails();

				bankDetails.setAccountNo(dto.getAccountNo());
				bankDetails.setBankName(dto.getBankName());
				bankDetails.setAccouontType(dto.getAccouontType());
				bankDetails.setIfscCode(dto.getIfscCode());
				bankDetails.setBranch(dto.getBranch());
				bankDetails.setState(dto.getState());

				return employeeRepo.save(employeePrimaryInfo).getEmployeeId();
			}
		}		
		return null;
	}
	
	


}
