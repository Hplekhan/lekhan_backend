package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AddressType {
	
	PERMANENT("PERMANENT"), TEMPORARY("TEMPORARY");
	private final String addressType;
	

}
