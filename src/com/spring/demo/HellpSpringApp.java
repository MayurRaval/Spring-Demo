package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellpSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach mCoach = context.getBean("myCoach",Coach.class);
		
		System.out.print(mCoach.getDailyWorkout());
		System.out.print(mCoach.getDailyFortune());
		context.close();
	}

}
