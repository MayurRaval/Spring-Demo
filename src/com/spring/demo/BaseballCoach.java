package com.spring.demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneSerive;
	
	public BaseballCoach(FortuneService theFortuneSerive) {
		fortuneSerive = theFortuneSerive;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneSerive.getFortune();
	}

}