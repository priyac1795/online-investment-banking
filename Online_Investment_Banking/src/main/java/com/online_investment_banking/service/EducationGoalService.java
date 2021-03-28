package com.online_investment_banking.service;

import org.springframework.stereotype.Service;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.repository.EducationGoalRepository;

@Service
public class EducationGoalService {

	
	private EducationGoalRepository educationRepo;
	
	public EducationGoal createEducationGoal(EducationGoal educationGoal) {
		return educationRepo.save(educationGoal);
	}
}
