//package com.online_investment_banking.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.online_investment_banking.dto.GoalRequest;
//import com.online_investment_banking.model.CustomerInvestmentProfile;
//import com.online_investment_banking.repository.CustomerInvestmentProfileRepository;
//import com.online_investment_banking.repository.EducationGoalRepository;
//
//@RestController
//@RequestMapping("/online_investment_banking")
//public class CreateGoalController {
//	
//	@Autowired
//	private CustomerInvestmentProfileRepository customerRepo;
//	@Autowired
//	private EducationGoalRepository educationRepo;
//	
//	@PostMapping("/requestGoal")
//	public CustomerInvestmentProfile requestGoal(@RequestBody GoalRequest goalRequest) {
//		return customerRepo.save(goalRequest.getCustomerInvest());
//	}
//	
//	@GetMapping("/allGoals")
//    public List<CustomerInvestmentProfile> findAllGoals(){
//    	return customerRepo.findAll();
//    	}
//}
