package com.online_investment_banking.service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
   public List<String> getLowRiskReport(long custId) {
		String[] generateReport = {"Customer ID: ", "Customer Name: ", "Customer Age: ","Annual Income: ","Beneficiary Name: ", "Age of the Beneficiary: ", "Beneficiary Relationship: ", "Beneficiary School Name: ","Annual fee:", 
				"Total Amount for Investment: ","% customer plan to pay for: ","Amount to investment in Education Goal: ",
				  "Savings For(Savings Goal): ", "Estimated investment for Savings Goal: ", "Monthly Savings (Savings Goal): ","Balance Amount: " };
	   String report = financialAdvisorRepo.getLowRiskReport(custId);
	   List<String> finalLowRiskReport = new ArrayList();
	   try {
		String[] getReport = report.split("[,]");
		 String generateLowRiskReport = null;
		
		System.out.println(getReport[0]);
	//	String[] getGenerateReport = generateReport.split("//,");
	   for(int i =0; i<=getReport.length-1;i++) {
		  generateLowRiskReport = generateReport[i].concat(getReport[i]).concat(",");
		  finalLowRiskReport.add(generateLowRiskReport);
		
		
	   }
	   System.out.println(finalLowRiskReport);
	
	   } 
	   catch(NullPointerException e) {
		   e.getMessage();
	   }
	return finalLowRiskReport;
	
	}
   
   public List<Long> findAllMedRiskIds()
  	{
      	return financialAdvisorRepo.findAllMedRiskIds();
  	}
     public List<String> getMedRiskReport(long custId) {
  		String[] generateReport = {"Costumer ID: ", "Customer Name: ","Customer Age: ","Annual Income:","Employer Contribution (%): ",
  				"Amount paid by Employer: ", "Customer Contribution (%) ", "Amount paid by the Customer: ",  "Disability Savings: "};
  	   String report = financialAdvisorRepo.getMedRiskReport(custId);
  	   List<String> finalMedRiskReport = new ArrayList();
  	   try {
  		String[] getReport = report.split("[,]");
  		 String generateMedRiskReport = null;
  		
  		System.out.println(getReport[0]);
  	//	String[] getGenerateReport = generateReport.split("//,");
  	   for(int i =0; i<=getReport.length-1;i++) {
  		  generateMedRiskReport = generateReport[i].concat(getReport[i]).concat(",");
  		  finalMedRiskReport.add(generateMedRiskReport);
  		
  		
  	   }
  	   System.out.println(finalMedRiskReport);
  	
  	   } 
  	   catch(NullPointerException e) {
  		   e.getMessage();
  	   }
  	return finalMedRiskReport;
  	
  	}
   
   public List<Long> findAllHighRiskIds()
	{
    	return financialAdvisorRepo.findAllHighRiskIds();
	}
   
   public List<String> getHighRiskReport(long custId) {
		String[] generateReport = {"Customer Id: ",  "Customer Name: ", "Customer age: ",  "Annual Income:",
				"Effective tax rate (%): ", "After tax annual income: ", "Monthly after-tax income: ", "Cover after-tax income for(months): ",  "Add Expenses: ", 
				 "Total needed: "};
	   String report = financialAdvisorRepo.getHighRiskReport(custId);
	   List<String> finalHighRiskReport = new ArrayList();
	   try {
		String[] getReport = report.split("[,]");
		 String generateHighRiskReport = null;
		
		System.out.println(getReport[0]);
	//	String[] getGenerateReport = generateReport.split("//,");
	   for(int i =0; i<=getReport.length-1;i++) {
		  generateHighRiskReport = generateReport[i].concat(getReport[i]).concat(",");
		  finalHighRiskReport.add(generateHighRiskReport);
		
		
	   }
	   System.out.println(finalHighRiskReport);
	
	   } 
	   catch(NullPointerException e) {
		   e.getMessage();
	   }
	return finalHighRiskReport;
	
	}
}
