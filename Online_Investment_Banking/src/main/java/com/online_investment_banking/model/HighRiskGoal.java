package com.online_investment_banking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@PersistenceContext
@AllArgsConstructor
@Table(name = "high_risk_goal2")
public class HighRiskGoal {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long custId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name="customer_age")
	private String customerAge;
   
	@Column(name="annual_income")
	private String annualIncome;
	
	@Column(name="tax_percent")
	private String taxPercent;
	
	@Column(name="after_tax_AI")
	private String afterTaxAI;
	
	@Column(name="monthly_after_taxIncome")
    private String monthlyAfterTaxIncome;
	
	@Column(name="cover_after_taxIncome_months")
	 private String coverAfterTaxIncome;
	
	@Column(name="add_expenses")
	 private String addExpenses;
	
	@Column(name="total")
	private String total;
}
