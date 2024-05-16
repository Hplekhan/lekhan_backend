package com.excel.lms.enums;

/*enum is used to be constant, other than this method we can't use(saving,current)*/
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountType {

	SAVING("SAVING"), CURENT("CURRENT");
	
	private final String accountType;
}
