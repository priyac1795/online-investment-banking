package com.online_investment_banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online_investment_banking.model.CustomerInvestmentProfile;
import com.online_investment_banking.model.EducationGoal;

@Repository
public interface EducationGoalRepository extends JpaRepository<EducationGoal, Long>{

}
