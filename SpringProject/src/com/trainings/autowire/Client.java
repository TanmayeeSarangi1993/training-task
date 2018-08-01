package com.trainings.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	
	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("mobile-context.xml");
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("camera-context.xml","speaker-context.xml","screen-context.xml");
		
		
		Mobile mobile=context.getBean("mobile",Mobile.class);
		
		
		System.out.println("Mobile Details : ");
		
		
		System.out.println("mobile Type : "+mobile.getCamera().getType());
		
		
		System.out.println("Screen Details "+ mobile.getScreen().getGlassType()+", "+mobile.getScreen().getLen()+", "+mobile.getScreen().getBre());
		
		System.out.println("Speaker Details "+ mobile.getSpeaker().getType()+", "+mobile.getSpeaker().getVolLevels());

		
	}

}
