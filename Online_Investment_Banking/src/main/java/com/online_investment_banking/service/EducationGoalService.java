package com.online_investment_banking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_investment_banking.model.CustomerInvestmentProfile;
import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.repository.EducationGoalRepository;

@Service
@Transactional
public class EducationGoalService {

	@Autowired
	private EducationGoalRepository educationRepo;
	
	public EducationGoal createEducationGoal(EducationGoal educationGoal) {
	
		return educationRepo.save(educationGoal);
		
	}
}
