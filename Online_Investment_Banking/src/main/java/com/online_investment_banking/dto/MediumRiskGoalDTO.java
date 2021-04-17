package com.online_investment_banking.dto;

import javax.persistence.Column;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.ToString;

@Data
@Component
@ToString
@JsonIgnoreProperties
public class MediumRiskGoalDTO {
	
	
	
	 private String taxPercent;
	
	 private String employerPercent;
	
	 private String customerPercent;
	
	 private String disabilitySavings;


}
