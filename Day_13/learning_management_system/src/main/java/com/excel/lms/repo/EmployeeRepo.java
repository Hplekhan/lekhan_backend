package com.excel.lms.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;


public interface EmployeeRepo  extends JpaRepository<EmployeePrimaryInfo, Integer>{
	 Optional<EmployeePrimaryInfo> findByEmployeeId(String string);
}
