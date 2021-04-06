package com.online_investment_banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_investment_banking.model.CustomerInvestmentProfile;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.repository.CustomerInvestmentProfileRepository;

@Service
public class CustomerInvestmentProfileService {
	
	@Autowired
	CustomerInvestmentProfileRepository custInvestProfileRepo;
	
	public CustomerInvestmentProfile createCustomer(CustomerInvestmentProfile customerInvestmentProfile) {
		
		return custInvestProfileRepo.save(customerInvestmentProfile);
	}

	public List<CustomerInvestmentProfile> getAllCustomerInfo(){
		return custInvestProfileRepo.findAll();
	}

}
