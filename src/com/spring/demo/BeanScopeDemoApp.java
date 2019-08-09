package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext mContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach mCoach = mContext.getBean("myCoach",Coach.class);
		Coach anotherCoach = mContext.getBean("myCoach",Coach.class);
		
		boolean isEqual = (mCoach == anotherCoach);
		
		System.out.println("is Both equal || "+ isEqual);
		
		System.out.println("\n Memory location for the mCoach|| "+ mCoach);
		
		System.out.println("\n Memory location for the anotherCoach|| "+ anotherCoach);
		
	}
}
