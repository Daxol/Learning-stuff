package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data ={"Good day", "happy day" , "best day"};
	
	
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		return data[rand.nextInt(data.length)];
	}

}
