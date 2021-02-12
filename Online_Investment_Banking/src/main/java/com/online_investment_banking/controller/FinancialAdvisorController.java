package com.online_investment_banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.online_investment_banking.model.FinancialAdvisor;
import com.online_investment_banking.service.FinancialAdvisorService;


@CrossOrigin
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
}
