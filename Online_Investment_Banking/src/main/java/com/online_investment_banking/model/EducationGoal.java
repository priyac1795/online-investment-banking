package com.online_investment_banking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@PersistenceContext
@Table(name = "education_goal3")
public class EducationGoal {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long lowRiskId;
	
	@Column(name = "beneficiary_name")
	private String name;
	
	@Column(name = "beneficiary_age")
	private String age;
	
	@Column(name = "relationship")
	private String relationship;

	@Column(name = "school_name")
	private String schoolName;	
	
	@Column(name = "annual_fee")
	private String annualFee;
	
	@Column(name = "percent_to_pay")
	private String percentToPay;
	
	@Column(name = "tot_amt_investment")
	private String totAmtForInvest;
	
	@Column(name = "amt_for_invest_eduGoal")
	private String amtToInvestEduGoal;
	
	@Column(name = "balance")
	private String balance;
	
	@Column(name = "savings_for")
    private String savingsFor;
	
	@Column(name = "estimated_cost")
	private String estimatedCost;
	
	@Column(name = "monthly_savings")
	private String monthlySavings;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", insertable = false, updatable = false, nullable = true) 
	private CustomerInvestmentProfile customerInfo;

	

	
}
