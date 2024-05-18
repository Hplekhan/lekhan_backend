package com.excel.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.BankDetails;

public interface EmployeeBankDetailsRepo extends JpaRepository<BankDetails, Integer> {

}
