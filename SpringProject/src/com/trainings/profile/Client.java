package com.trainings.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext();
		
		((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Production","Development");
		
		//scans the mentioned packages and register all the components available in the spring
		
		
		((AnnotationConfigApplicationContext)context).scan("com.trainings.profile");
		
		((AnnotationConfigApplicationContext)context).refresh();
		
		((AnnotationConfigApplicationContext)context).close();
		
		
		
		
		
		
		

		
		
		
	}

}
