package com.excel.lms.dto;

import com.excel.lms.enums.ContactType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactInfoDto {
	
	private int conatct_id;
	
	private ContactType contactType;
	
	private String contactNumber;

}
