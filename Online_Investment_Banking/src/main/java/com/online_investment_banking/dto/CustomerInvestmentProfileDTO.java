package com.online_investment_banking.dto;


import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.online_investment_banking.model.CustomerInfo;

import lombok.Data;
import lombok.ToString;

@Data
@Component
@ToString
@JsonIgnoreProperties
public class CustomerInvestmentProfileDTO {

//	private CustomerInfo customerInfo;

	private String customerName;
	
	private String customerAge;

	private String annualIncome;

	private String amtForInvestment;
	
	private List<EducationGoalDTO> goalInfo;

}
