package com.online_investment_banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.model.HighRiskGoal;

@Repository
public interface HighRiskGoalRepository  extends JpaRepository<HighRiskGoal, Long>{

}
