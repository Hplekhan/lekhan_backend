package com.excel.lms.dto;


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
public class TechnicalSkillsDto {
	
private int technical_id;
	
	private String skillType;
	
	private double skillRating;
	
	private double yearOfExperience;
	
	

}
