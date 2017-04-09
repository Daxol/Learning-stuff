package com.luv2code.springdemo;

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

	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("start up stuff");
	}
	
	@PreDestroy
	public void doMyDestroyStuff(){
		System.out.println("destroy stuff");
	}

	@Override
	public String getDailyWorkput() {
		return "practise your hand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	// @Autowired
	// public TennisCoach(FortuneService fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	// @Autowired
	// public void setFortuneService(FortuneService fortuneService) {
	// this.fortuneService = fortuneService;
	// System.out.println("set fortune");
	// }
}
