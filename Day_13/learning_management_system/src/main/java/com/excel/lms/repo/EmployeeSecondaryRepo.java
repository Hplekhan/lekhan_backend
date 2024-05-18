package com.excel.lms.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeSecondaryInfo;

public interface EmployeeSecondaryRepo extends JpaRepository<EmployeeSecondaryInfo, Integer> {

}
