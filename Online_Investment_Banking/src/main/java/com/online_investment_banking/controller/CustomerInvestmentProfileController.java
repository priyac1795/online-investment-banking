package com.online_investment_banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_investment_banking.dto.CustomerInvestmentProfileDTO;
import com.online_investment_banking.dto.CustomerProfileForMediumRiskDTO;
import com.online_investment_banking.model.CustomerInvestmentProfile;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.model.MediumRiskGoal;
import com.online_investment_banking.service.CustomerInvestmentProfileService;
import com.sun.istack.NotNull;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/online_investment_banking")
public class CustomerInvestmentProfileController {
	
	@Autowired(required = true)
	private CustomerInvestmentProfileService custInvestservice;
	
	@PostMapping("/createCustomer")
	public CustomerInvestmentProfile createCustomer(@NotNull@RequestBody CustomerInvestmentProfileDTO customerInvestmentProfileDTO)
	
	{
		
		return custInvestservice.createCustomer(customerInvestmentProfileDTO);
	}

	@PostMapping("/createCustomerForMedRisk")
	public MediumRiskGoal createCustomerForMedRisk(@RequestBody MediumRiskGoal mediumRiskgoal)
	
	{
		
		return custInvestservice.createCustomerForMedRisk(mediumRiskgoal);
	}
	
}
 