package com.daniel.udemydemo1;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] dataFortuneService = { "do it! you're doing well!", "Don't waste time!", "be the best!" };

	private Random rand = new Random();

	@Override
	public String getFortune() {
		int index = rand.nextInt(dataFortuneService.length);
		String fortune = dataFortuneService[index];
		return fortune;
	}

}
