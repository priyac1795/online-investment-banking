package com.online_investment_banking.dto;



import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;
import lombok.ToString;

@Data
@Component
@ToString
@JsonIgnoreProperties
public class EducationGoalDTO {
	
	
	private String name;
	
	private String age;
	
	private String relationship;

	private String schoolName;	

	private String annualFee;
	
	private String percentToPay;
	
	private String totAmtForInvest;

	private String amtToInvest;
	
	private String balance;
	
	private String savingsFor;
	
	private String estimatedCost;
	
	private String monthlySavings;
	

}
