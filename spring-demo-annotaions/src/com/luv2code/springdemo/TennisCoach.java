package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkput() {
		return "practise your hand";
	}

}
