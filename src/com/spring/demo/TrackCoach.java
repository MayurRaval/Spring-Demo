package com.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
	
	}
	
	public TrackCoach(FortuneService thefortuneService) {
		System.out.print("Inside TrackCoach constructor");
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "\nRun a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartUpStuff() {
		System.out.print("\nTrackCoach doMyStartUpStuff");
	}
	
	// add an destroy method
	public void doMyCleanUpStuff() {
		System.out.print("\nTrackCoach doMyCleanUpStuff");
	}
	

}