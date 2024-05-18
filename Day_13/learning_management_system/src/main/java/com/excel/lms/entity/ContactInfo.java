package com.excel.lms.entity;

import java.time.LocalDate;
import java.time.Year;

import com.excel.lms.enums.ContactType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee_contact_info")
public class ContactInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int conatct_id;
	
	@Enumerated(EnumType.STRING)
	private ContactType contactType;
	
	private String contactNumber;
	
	@JoinColumn(name ="employeeId")
	@ManyToOne(fetch = FetchType.LAZY)
	private EmployeePrimaryInfo employeePrimaryInfo;

}