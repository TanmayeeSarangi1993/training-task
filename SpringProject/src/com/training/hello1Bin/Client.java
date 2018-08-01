package com.training.hello1Bin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeting greeting = context.getBean("english",Greeting.class);
		Greeting greeting1 = context.getBean("french",Greeting.class);
		Greeting greeting3 = context.getBean("Odiya",Greeting.class);

		
		System.out.println(greeting.greetHello());
		System.out.println(greeting1.greetHello());
		System.out.println(greeting3.greetHello());

		
		
	}

}
