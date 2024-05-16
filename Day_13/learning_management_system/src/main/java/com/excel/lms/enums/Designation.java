package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum  Designation {
	
	TRAINEE("TRAINEE"),  MENTOR("MENTOR"),  DEVELOPER("DEVELOPER"),  TESTER("TESTER"),  OTHERS("OTHERS");
	
	private final String designationType;

}
