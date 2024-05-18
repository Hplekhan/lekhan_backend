package com.excel.lms.dto;

import com.excel.lms.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDetailsDto {
	private int bank_id;
	
	private String employeeId;
	
	private String accountNo;
	
	private String bankName;
	
	private AccountType accouontType;
	
	private String ifscCode;
	
	private String branch;
	
	private String state;

}
