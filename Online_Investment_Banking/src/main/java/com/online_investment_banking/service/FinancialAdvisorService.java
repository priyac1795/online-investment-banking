package com.online_investment_banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.repository.FinancialAdvisorRepository;

@Service
public class FinancialAdvisorService {
	
	@Autowired
	private FinancialAdvisorRepository financialAdvisorRepo;
	
	public List<FinancialAdvisor> getAllFinacialAdvisors(){
		return financialAdvisorRepo.findAll();
	}

}
