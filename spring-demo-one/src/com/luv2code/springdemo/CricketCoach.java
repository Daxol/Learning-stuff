package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("cicket coach  set email ");

	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("cicket coach set team");

	}

	public CricketCoach() {
		System.out.println("cicket coach no arg");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("cicket coach setter");

	}

	@Override
	public String getDailyWorkout() {
		return "practise fast bowling for 15 mins ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
