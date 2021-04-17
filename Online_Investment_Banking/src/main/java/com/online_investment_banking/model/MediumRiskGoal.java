package com.online_investment_banking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "medium_risk_goal2")
public class MediumRiskGoal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "customer_name")
	private String customerName;
	
	@Column(name= "customer_age")
	private String customerAge;
	
	@Column(name= "annual_income")
	private String annualIncome;
	
	 @Column(name= "tax_percent")
	 private String taxPercent;
	 
	 @Column(name= "emp_percent")
	 private String employerPercent;
	 
	 @Column(name = "amt_by_employer")
	 private String amtContribByEmployer;
	
	 
	 @Column(name= "customer_percent")
	 private String customerPercent;
	 
	 
	 @Column(name = "amt_by_customer")
	 private String amtContribByCustomer;
	 
	 @Column(name= "disability_savings")
	 private String disabilitySavings;
	 
	

}
