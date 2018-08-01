package com.training.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("messageresource-context.xml");
	HeloWorld helloworld = context.getBean("heloworld",HeloWorld.class);

	String engGoodMorning = context.getMessage("goodmorning",new Object[] {},null );
	String frGoodMorning = context.getMessage("goodmorning",new Object[] {},new Locale("FR") );
	
	System.out.println(engGoodMorning);
	System.out.println(frGoodMorning);
		
	System.out.println("-----------------------------------");
	
		
	helloworld.sayHelloWorld();
	helloworld.sayHelloWorld_fr();
}
}