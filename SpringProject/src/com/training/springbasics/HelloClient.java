package com.training.springbasics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloClient {
	
	
	public static void main(String[] args) {
		
		
	//	XmlBeanFactory  factory = new XmlBeanFactory(new ClassPathResource("spring-content.xml"));
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-content.xml");
		
		
		HelloService helloService = (HelloService) factory.getBean("defaultHello");
		
		System.out.println(helloService.sayHello());
		
		
	}

}
