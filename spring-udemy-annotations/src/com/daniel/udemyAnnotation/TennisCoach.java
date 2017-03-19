package com.daniel.udemyAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> konstruktor");
	}

	@PostConstruct
	public void doMyStartupStuff() {

		System.out.println(getDailyFortune());
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("cleanup");
	}

	// @Autowired
	// public TennisCoach(FortuneService fortuneService){
	// this.fortuneService = fortuneService;
	// }

	//
	// @Autowired
	// public void doSomeFortuneService(FortuneService fortuneService){
	// this.fortuneService = fortuneService;
	// System.out.println("setter fortune");
	// }

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
