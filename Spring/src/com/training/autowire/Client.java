package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.training.spring.HelloService;

public class Client {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context2.xml");
	
	
	Mobile mobile = context.getBean("mobile",Mobile.class);
	
	System.out.println("Mobile Details:"+ mobile);
	
	System.out.println("Mobile Type" + mobile.getCamera().getType());
	
	System.out.println(" Speaker Details" + mobile.getSpeaker().getType()+""+mobile.getSpeaker().getVollevels());
	
	
System.out.println("Screen Details" +mobile.getScreen().getBre() + " "+mobile.getScreen().getLen()+""+mobile.getScreen().getGlassType());
	
	System.out.println("----------------");
	
	
	
}
}
