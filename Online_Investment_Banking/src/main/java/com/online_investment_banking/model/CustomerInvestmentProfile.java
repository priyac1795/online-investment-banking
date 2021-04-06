package com.online_investment_banking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customerInvestment2")
public class CustomerInvestmentProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String customerName;
	
	@Column(name = "age")
	private String customerAge;
	
	@Column(name = "annual_income")
	private String annualIncome;

	@Column(name = "amt_for_investment")
	private String amtForInvestment;
	
	@OneToMany(mappedBy = "customerInfo", cascade = CascadeType.ALL)
	private List<EducationGoal> goalInfo;

}
	