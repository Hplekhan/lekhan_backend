package com.excel.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.ContactInfo;

public interface ContactInfoRepo  extends JpaRepository<ContactInfo, Integer>{

}
