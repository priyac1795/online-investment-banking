package com.online_investment_banking.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.model.FinancialAdvisor;

@Repository
public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {

	@Query(value = "SELECT customer_id FROM education_goal2" , nativeQuery = true)
	public List<Long> findAllLowRiskIds();
	
	@Transactional
	@Query(value="SELECT * FROM education_goal2 "
			+ "FULL JOIN customer_investment3 "
			+ "WHERE customer_id = customer_investment3.id " + 
			"AND customer_id= :custId", nativeQuery = true)
	public String getLowRiskReport(@Param ("custId") long custId);
	
}
