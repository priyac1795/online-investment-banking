package com.online_investment_banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_investment_banking.model.EducationGoal;
import com.online_investment_banking.service.EducationGoalService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/online_investment_banking")
public class EducationGoalController {
	
	@Autowired
	private EducationGoalService educationService;

	@PostMapping("/educationGoal")
	public EducationGoal createEducationGoal(@RequestBody EducationGoal educationGoal) {
		return educationService.createEducationGoal(educationGoal);
	}
}
