package com.online_investment_banking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "education_goal")
public class EducationGoal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "relationship")
	private String relationship;

	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "annual_fee")
	private String annualFee;
	
	@Column(name = "percent_to_play")
	private String percentToPay;
	
	@Column(name = "tot_amt_investment")
	private String totAmtForInvest;
	
	@Column(name = "amt_for_invest")
	private String amtForInvest;
	
	@Column(name = "balance")
	private String balance;
}