package com.daniel.udemydemo1;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it!: " + fortuneService.getFortune();

	}

	// init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method domystart");
	}

	// destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
