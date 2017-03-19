package com.daniel.udemydemo1;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("cricket set email");
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("cricket set team");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("cricket no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket setter method fortune");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "make 50 pump up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
