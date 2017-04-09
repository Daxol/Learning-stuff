package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team")
	private String team;
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkput() {
		return "swim 1000m";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
