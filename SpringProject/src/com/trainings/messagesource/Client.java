package com.trainings.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("message-resource-content.xml");
		
		String engGoodMorning = applicationContext.getMessage("goodmorning", new Object[] {},null);
		
		String frGoodMorning = applicationContext.getMessage("goodmorning", new Object[] {},new Locale("FR"));
		
		String geGoodMorning = applicationContext.getMessage("goodmorning", new Object[] {},new Locale("GE"));

		
		System.out.println(engGoodMorning);
		System.out.println(frGoodMorning);
		System.out.println(geGoodMorning);	
		
		System.out.println("--------------------------------------------------------------------------");
		
		
		
		
		
		HelloWorld helloWorld=applicationContext.getBean("helloworld",HelloWorld.class);
		
		helloWorld.sayHelloWorld();
		helloWorld.sayHelloWorld_fr();
		helloWorld.sayHelloWorld_ge();

		
		
	}

}
