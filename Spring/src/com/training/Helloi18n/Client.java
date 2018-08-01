package com.training.Helloi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeting greeting = context.getBean("french",Greeting.class);
	  System.out.println(greeting.greetHello());	
	  
	  Greeting greeting1 = context.getBean("english",Greeting.class);
	  System.out.println(greeting1.greetHello());	
	}

}
