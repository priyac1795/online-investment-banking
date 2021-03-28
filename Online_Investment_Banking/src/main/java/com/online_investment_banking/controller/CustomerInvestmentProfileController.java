package com.online_investment_banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_investment_banking.model.CustomerInvestmentProfile;
import com.online_investment_banking.service.CustomerInvestmentProfileService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/online_investment_banking")
public class CustomerInvestmentProfileController {
	
	@Autowired(required = true)
	private CustomerInvestmentProfileService custInvestservice;
	
	@PostMapping("/createCustomer")
	public CustomerInvestmentProfile createCustomer(@RequestBody CustomerInvestmentProfile customerInvestmentProfile)
	{
		return custInvestservice.createCustomer(customerInvestmentProfile);
	}

}
