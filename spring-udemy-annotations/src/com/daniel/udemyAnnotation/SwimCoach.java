package com.daniel.udemyAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "15 minutes swim";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
