package com.training.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
  public static void main(String[] args) {
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.getEnvironment().setActiveProfiles("dev	");
	context.register(AppConfig.class);
	context.refresh();
	//((AnnotationConfigApplicationContext)context).scan("com.training.profile");
	//((AnnotationConfigApplicationContext)context).refresh();
	//((AnnotationConfigApplicationContext)context).close();
}
}
