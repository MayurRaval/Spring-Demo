package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext mContext = new ClassPathXmlApplicationContext("beanScopeLifeCycle-applicationContext.xml");
		
		Coach mCoach = mContext.getBean("myCoach",Coach.class);
		
		System.out.println(mCoach.getDailyWorkout());
		
		mContext.close();
	}
}
