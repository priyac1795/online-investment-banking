package com.online_investment_banking.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.mapper.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.online_investment_banking.dto.CustomerInvestmentProfileDTO;
import com.online_investment_banking.dto.CustomerProfileForMediumRiskDTO;
import com.online_investment_banking.dto.EducationGoalDTO;
import com.online_investment_banking.dto.MediumRiskGoalDTO;
import com.online_investment_banking.model.CustomerInvestmentProfile;
import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.model.MediumRiskGoal;
import com.online_investment_banking.repository.CustomerInvestmentProfileRepository;
import com.online_investment_banking.repository.MediumRiskGoalRepository;


@Service
public class CustomerInvestmentProfileService {
	
	@Autowired
	CustomerInvestmentProfileRepository custInvestProfileRepo;
	
	@Autowired
	MediumRiskGoalRepository mediumRiskGoalRepo;
	
	public CustomerInvestmentProfile createCustomer(CustomerInvestmentProfileDTO customerInvestmentProfileDTO) {
		
		CustomerInvestmentProfile customerInvestEntity = new CustomerInvestmentProfile();
		
		List<EducationGoal> goalInfoList = new ArrayList<>();
		List<EducationGoalDTO> customerGoalInfoList = customerInvestmentProfileDTO.getGoalInfo();
			
		customerInvestEntity.setCustomerName(customerInvestmentProfileDTO.getCustomerName());
		customerInvestEntity.setCustomerAge(customerInvestmentProfileDTO.getCustomerAge());
		customerInvestEntity.setAnnualIncome(customerInvestmentProfileDTO.getAnnualIncome());
		customerInvestEntity.setAmtForInvestment(customerInvestmentProfileDTO.getAmtForInvestment());
		
		if(!CollectionUtils.isEmpty(customerGoalInfoList)) {
		
		for(EducationGoalDTO eduGoal :customerGoalInfoList){
		
			EducationGoal educationGoalEntity = new  EducationGoal();
			
			educationGoalEntity.setName(eduGoal.getName());
			educationGoalEntity.setAge(eduGoal.getAge());
			educationGoalEntity.setRelationship(eduGoal.getRelationship());
			educationGoalEntity.setSchoolName(eduGoal.getSchoolName());
			educationGoalEntity.setAnnualFee(eduGoal.getAnnualFee());	
			educationGoalEntity.setPercentToPay(eduGoal.getPercentToPay());
			educationGoalEntity.setTotAmtForInvest(eduGoal.getTotAmtForInvest());
			educationGoalEntity.setAmtToInvest(eduGoal.getAmtToInvest());
			educationGoalEntity.setBalance(eduGoal.getBalance());
			educationGoalEntity.setSavingsFor(eduGoal.getSavingsFor());
			educationGoalEntity.setEstimatedCost(eduGoal.getEstimatedCost());
			educationGoalEntity.setMonthlySavings(eduGoal.getMonthlySavings());

			
			goalInfoList.add(educationGoalEntity );
		}
		}
		
		//educationGoalEntity.setCustomerInfo(customerInvestmentProfileDTO.getCustomerInfo());
		
		
		
		
		customerInvestEntity.setGoalInfo(goalInfoList);
		
		return custInvestProfileRepo.save(customerInvestEntity);
	}


	public MediumRiskGoal createCustomerForMedRisk(MediumRiskGoal mediumRiskgoal) {
		
		return mediumRiskGoalRepo.save(mediumRiskgoal);
		
		/*CustomerInvestmentProfile customerInvestEntity = new CustomerInvestmentProfile();
		
		List<MediumRiskGoal> medGoalInfoList = new ArrayList<>();
		List<MediumRiskGoalDTO> customerMedRiskGoalInfoList = customerProfileForMediumRiskDTO.getMedRiskGoalInfo();
		
		
		customerInvestEntity.setCustomerName(customerProfileForMediumRiskDTO.getCustomerName());
		customerInvestEntity.setCustomerAge(customerProfileForMediumRiskDTO.getCustomerAge());
		customerInvestEntity.setAnnualIncome(customerProfileForMediumRiskDTO.getAnnualIncome());
		
		
		if(!CollectionUtils.isEmpty(customerMedRiskGoalInfoList)) {
			
			for(MediumRiskGoalDTO medRiskGoal :customerMedRiskGoalInfoList){
				
				MediumRiskGoal mediumRiskGoalEntity = new MediumRiskGoal();
				mediumRiskGoalEntity.setTaxPercent(medRiskGoal.getTaxPercent());
				mediumRiskGoalEntity.setEmployerPercent(medRiskGoal.getEmployerPercent());
				mediumRiskGoalEntity.setCustomerPercent(medRiskGoal.getCustomerPercent());
				mediumRiskGoalEntity.setDisabilitySavings(medRiskGoal.getDisabilitySavings());
				
				medGoalInfoList.add(mediumRiskGoalEntity);
			}
		}
		customerInvestEntity.setMedRiskGoalInfo(medGoalInfoList);
		return custInvestProfileRepo.save(customerInvestEntity);*/
		
		
		
		
	}

}
