package com.daniel.udemydemo1;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes running";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
