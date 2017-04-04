package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {

		return "run 10 miles";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public TrackCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}
	public TrackCoach(){
		
	}
	
	public void doMyStartupStuff(){
		System.out.println("startup method");
	}
	
	public void doMyCleanupStuff(){
		System.out.println("clean up");
	}

}
