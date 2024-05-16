package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EducationType {

	UNDERGRADUATE("UNDERGRADUATE"),  POSTGRADUATE("POSTGRADUATE"),  ENGINEERING("ENGINEERING"), OTHERS("OTHERS");

	private final String educationType;
}
