package com.excel.lms.dto;

import com.excel.lms.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressInfoDto {
	private int address_id;
	
	private AddressType addressType;
	
	private String doorNo;
	
	private String street;
	
	private String locality;
	
	private String city;
	
	private String state;
	
	private String pinCode;
	
	private String landMark;

}
