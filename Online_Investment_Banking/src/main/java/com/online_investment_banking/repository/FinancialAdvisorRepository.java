package com.online_investment_banking.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.model.HighRiskGoal;

@Repository
public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {

	@Query(value = "SELECT customer_id FROM education_goal3" , nativeQuery = true)
	public List<Long> findAllLowRiskIds();
	
	@Transactional
	@Query(value="SELECT customer_id,name, age, annual_income, beneficiary_name, beneficiary_age, relationship, school_name,  annual_fee, tot_amt_investment, percent_to_pay, amt_for_invest_eduGoal, savings_for, estimated_cost, monthly_savings, balance  FROM education_goal3 "
			+ "FULL JOIN customer_investment3 "
			+ "WHERE customer_id = customer_investment3.id " + 
			"AND customer_id= :custId", nativeQuery = true)
	public String getLowRiskReport(@Param ("custId") long custId);
	
	@Query(value = "SELECT custId FROM high_risk_goal2" , nativeQuery = true)
	public List<Long> findAllHighRiskIds();
	
	@Query(value="SELECT custId, customer_name, customer_age, annual_income, tax_percent, after_tax_AI, monthly_after_taxIncome, cover_after_taxIncome_months, add_expenses, total FROM high_risk_goal2 "
			+ "WHERE custId = :custId" , nativeQuery = true)
	public String getHighRiskReport(@Param ("custId") long custId);
	
	@Query(value = "SELECT id FROM medium_risk_goal2" , nativeQuery = true)
	public List<Long> findAllMedRiskIds();
	
	@Query(value="SELECT id, customer_name, customer_age, annual_income, emp_percent, amt_by_employer, customer_percent, amt_by_customer, disability_savings FROM medium_risk_goal2 "
			+ "WHERE id = :custId" , nativeQuery = true)
	public String getMedRiskReport(@Param ("custId") long custId);
}
