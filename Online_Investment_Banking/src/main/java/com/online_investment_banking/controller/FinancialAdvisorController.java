package com.online_investment_banking.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.service.FinancialAdvisorService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/online_investment_banking")
public class FinancialAdvisorController {
	
	@Autowired
	private FinancialAdvisorService financialAdvisorService;
	
	@GetMapping("/getFAlist")
	public List<FinancialAdvisor> getAllFinacialAdvisors() {
		
		return financialAdvisorService.getAllFinacialAdvisors();
		
	}

	@PostMapping("/createFA")
	public FinancialAdvisor createFinancialAdvisor(@RequestBody FinancialAdvisor financialAdvisor)
	{
		return financialAdvisorService.createFinancialAdvisor(financialAdvisor);
	}
	
	@GetMapping("/getFA/{fid}")
    public ResponseEntity<FinancialAdvisor> getFinancialAdvisor(@PathVariable long fid) throws Exception {
		
		return financialAdvisorService.getFinancialAdvisor(fid);
	}
	
	@PutMapping("/updateFA/{fid}")
    public FinancialAdvisor updateFinancialAdvisor(@PathVariable long fid, @RequestBody FinancialAdvisor financialAdvisorDetails) throws Exception {
		return financialAdvisorService.updateFinancialAdvisor(fid, financialAdvisorDetails);
	
	}
	
	@DeleteMapping("/deleteFA/{fid}")
    public void deleteFinancialAdvisor(@PathVariable long fid){
    	financialAdvisorService.deleteFinancialAdvisor(fid);
    }
	
	@GetMapping("/getAllLowRiskIds")
	public List<Long> getAllLowRiskIds()
	{
		return financialAdvisorService.findAllLowRiskIds();
	}
	@GetMapping("/getAllMedRiskIds")
	public List<Long> getAllMedRiskIds()
	{
		return financialAdvisorService.findAllMedRiskIds();
	}
	@GetMapping("/getAllHighRiskIds")
	public List<Long> getAllHighRiskIds()
	{
		return financialAdvisorService.findAllHighRiskIds();
	}
	
	@GetMapping("getLowRiskReport/{custId}")
	public List<String> getLowRiskReport(@PathVariable long custId) {
		
		return financialAdvisorService.getLowRiskReport(custId);
	}
	@GetMapping("getMedRiskReport/{custId}")
	public List<String> getMedRiskReport(@PathVariable long custId) {
		
		return financialAdvisorService.getMedRiskReport(custId);
	}

	@GetMapping("getHighRiskReport/{custId}")
	public List<String> getHighRiskReport(@PathVariable long custId) {
		
		return financialAdvisorService.getHighRiskReport(custId);
	}
}
