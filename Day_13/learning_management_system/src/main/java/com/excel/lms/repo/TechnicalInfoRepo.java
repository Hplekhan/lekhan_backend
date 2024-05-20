package com.excel.lms.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.TechnicalSkills;

public interface TechnicalInfoRepo extends JpaRepository<TechnicalSkills, Integer> {

	Optional<TechnicalSkills>	findBySkillTypeAndSkillRatingAndYearOfExperience(String skillType,Double  skillRating, Double yearOfExperience);
}
