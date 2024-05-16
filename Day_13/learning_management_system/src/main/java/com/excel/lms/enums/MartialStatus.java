package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MartialStatus {
	
	SINGLE("SINGLE"), MARRIED("MARRIED"), WIDOW("WIDOW"), DIVORCED("DIVORCED");
	
	private final String martialStatus;

}
