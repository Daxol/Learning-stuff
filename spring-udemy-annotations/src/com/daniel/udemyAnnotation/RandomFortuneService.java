package com.daniel.udemyAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] randomServices = {"You are lucky today!","be awesome","you can do that!"};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index;
		index = rand.nextInt(randomServices.length);
		return randomServices[index];
	}

}
