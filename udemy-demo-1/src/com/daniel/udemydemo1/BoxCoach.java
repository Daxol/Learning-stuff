package com.daniel.udemydemo1;

public class BoxCoach implements Coach {
	private FortuneService fortuneService;

	public BoxCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "10 minutes boxing";

	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();

	}

}
