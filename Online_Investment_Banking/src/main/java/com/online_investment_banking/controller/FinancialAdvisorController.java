package com.online_investment_banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<FinancialAdvisor> listFinancialadvisors() {
		
		return financialAdvisorService.getAllFinacialAdvisors();
		
	}

}
