package com.excel.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EducationalDetails;

public interface EducationalRepo extends JpaRepository<EducationalDetails, Integer>{

}
