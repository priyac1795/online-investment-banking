package com.online_investment_banking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.repository.FinancialAdvisorRepository;

@Service
public class FinancialAdvisorService {
	
	@Autowired
	private FinancialAdvisorRepository financialAdvisorRepo;
	
	public List<FinancialAdvisor> getAllFinacialAdvisors(){
		return financialAdvisorRepo.findAll();
	}

	public FinancialAdvisor createFinancialAdvisor(FinancialAdvisor financialAdvisor) {
		
		return financialAdvisorRepo.save(financialAdvisor);
	}
	
    public ResponseEntity<FinancialAdvisor> getFinancialAdvisor(long fid) throws Exception {
		
		FinancialAdvisor financialAdvisor = financialAdvisorRepo.findById(fid)
				.orElseThrow(()->new Exception("Financial Advisor not found with ID: " + fid));
		return ResponseEntity.ok(financialAdvisor);
	}
    
    public FinancialAdvisor updateFinancialAdvisor(long fid, FinancialAdvisor financialAdvisorDetails) throws Exception
    {
    	FinancialAdvisor financialAdvisor = financialAdvisorRepo.findById(fid)
				.orElseThrow(()->new Exception("Financial Advisor not found with ID: " + fid));
    	
    	financialAdvisor.setFirstName(financialAdvisorDetails.getFirstName());
    	financialAdvisor.setLastName(financialAdvisorDetails.getLastName());
    	financialAdvisor.setEmailId(financialAdvisorDetails.getEmailId());
    	financialAdvisor.setMobileNo(financialAdvisorDetails.getMobileNo());
    	financialAdvisor.setBranchNo(financialAdvisorDetails.getBranchNo());
    	
    	FinancialAdvisor updatedFinancialAdvisor = financialAdvisorRepo.save(financialAdvisor);	
    	
		return updatedFinancialAdvisor;
    }
    
    public void deleteFinancialAdvisor(long fid) {
    	 financialAdvisorRepo.deleteById(fid);;
    }
    
   public List<Long> findAllLowRiskIds()
	{
    	return financialAdvisorRepo.findAllLowRiskIds();
	}
   public String getLowRiskReport(long custId) {
		
	   return financialAdvisorRepo.getLowRiskReport(custId);
	}
}
