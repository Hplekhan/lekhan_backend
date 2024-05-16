package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ContactType {
	
	OFFICE("OFFICE"), PERSONAL("PERSONAL"), LANDLINE("LANDLINE");
	private final String contactType;
	

}
