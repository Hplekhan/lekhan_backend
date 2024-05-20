package com.excel.lms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.AddressInfoListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactInfoListDto;
import com.excel.lms.dto.EducationalInfoList;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.PrimaryEmployeeDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.ContactInfo;
import com.excel.lms.entity.EducationalDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.Experience;
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.repo.AddressInfoRepo;
import com.excel.lms.repo.ContactInfoRepo;
import com.excel.lms.repo.EducationalRepo;
import com.excel.lms.repo.EmployeeBankDetailsRepo;
import com.excel.lms.repo.EmployeeRepo;
import com.excel.lms.repo.EmployeeSecondaryRepo;
import com.excel.lms.repo.ExperiencInfoRepo;
import com.excel.lms.repo.TechnicalInfoRepo;
//import com.excel.lms.repo.TechnicalInfoRepo;
import com.excel.lms.util.ObjectUtils;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private EmployeeSecondaryRepo employeeSecondaryRepo;

	@Autowired
	private EmployeeBankDetailsRepo employeeBankDetailsRepo;

	@Autowired
	private EducationalRepo educationalRepo;

	@Autowired
	private AddressInfoRepo addressInfoRepo;

	@Autowired
	private ExperiencInfoRepo experiencInfoRepo;

	@Autowired
	private ContactInfoRepo contactInfoRepo;

	@Autowired
	private TechnicalInfoRepo technicalInfoRepo;

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

	@Override
	public String addEducationDetails(EducationalInfoList dto) {

		Optional<EmployeePrimaryInfo> byEmployeeId = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		if(byEmployeeId.isPresent()) {
			EmployeePrimaryInfo employee = byEmployeeId.get();

			List<EducationalDetails> educations = ObjectUtils.educationDtoToEntity(dto.getEducations());
			if(employee.getEducationDetails() != null) {                                                                                                                                         
				employee.getEducationDetails().stream().forEach(e -> educationalRepo.delete(e));
			}
			educations.stream().forEach(edu -> edu.setEmployeePrimaryInfo(employee));
			employee.setEducationDetails(educations);
			employeeRepo.save(employee);
			return employee.getEmployeeId();
		}

		return null;
	}

	@Override
	public String addAddressInfo(AddressInfoListDto dto) {

		Optional<EmployeePrimaryInfo> byEmployeeId = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		if(byEmployeeId.isPresent()) {
			EmployeePrimaryInfo info = byEmployeeId.get();

			List<AddressDetails> addressDtoToEntity = ObjectUtils.addressDtoToEntity(dto.getAddress());
			if(info.getAddressDetails() != null) {
				info.getAddressDetails().stream().forEach(x -> addressInfoRepo.delete(x));
			}
			addressDtoToEntity.stream().forEach(i -> i.setEmployeePrimaryInfo(info));
			info.setAddressDetails(addressDtoToEntity);
			employeeRepo.save(info);
			return info.getEmployeeId();

		}
		return null;
	}
	/*Experienece*/
	@Override
	public String addExperienceInfo(ExperienceListDto dto) {
		Optional<EmployeePrimaryInfo> gettedEmpId  = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		if(gettedEmpId.isPresent()) {
			EmployeePrimaryInfo emp  = gettedEmpId.get();

			List<Experience> dtoToEntity = ObjectUtils.dtoToEntity(dto.getExperiences());
			if(emp.getExperienceDetails() != null) {
				emp.getExperienceDetails().stream().forEach(experiencInfoRepo::delete);
			}
			dtoToEntity.stream().forEach(a -> a.setEmployeePrimaryInfo(emp));
			emp.setExperienceDetails(dtoToEntity);

			employeeRepo.save(emp);
			return emp.getEmployeeId();
		}
		return null;
	}

	/*Contact*/
	
	@Override
	public String addContactInfo(ContactInfoListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();

			List<ContactInfo> contacts = ObjectUtils.contactDtoToEntity(dto.getContactsList());
			if(primaryInfo.getContacts() != null) {
				primaryInfo.getContacts().stream().forEach(c -> contactInfoRepo.delete(c));
			}
			contacts.stream().forEach(b -> b.setEmployeePrimaryInfo(primaryInfo));
			primaryInfo.setContacts(contacts);
			employeeRepo.save(primaryInfo);
			return primaryInfo.getEmployeeId();
		}
		return null;
	}

	

//	/*Technical Skills*/
	@Override
	public String saveTechnicalSkills(TechnicalSkillsListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepo.findByEmployeeId(dto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<TechnicalSkills> skills  = dto.getSkillsList().stream().map(s -> {
				Optional<TechnicalSkills> opt =  technicalInfoRepo.findBySkillTypeAndSkillRatingAndYearOfExperience(
						s.getSkillType(),
						s.getSkillRating(),
						s.getYearOfExperience());

				return opt.isPresent() ? opt.get() : ObjectUtils.technicalDtoToEntity(s);
			}).collect(Collectors.toList());
			
			if(primaryInfo.getSkills() != null) {
				primaryInfo.getSkills().clear();
			}
			
			skills.stream().forEach(x -> {
				if(!x.getListOfSkills().contains(primaryInfo))
					x.getListOfSkills().add(primaryInfo);
			});
			primaryInfo.setSkills(skills);
			employeeRepo.save(primaryInfo);
			return primaryInfo.getEmployeeId();
		}
		return null;
	}








}

