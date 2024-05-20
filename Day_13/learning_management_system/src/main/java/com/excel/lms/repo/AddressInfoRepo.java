package com.excel.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.AddressDetails;

public interface AddressInfoRepo extends JpaRepository<AddressDetails, Integer>{

}
