package com.training.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloClient {
	public static void main(String[] args) {
		//XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-context1.xml");
		HelloService helloservice =(HelloService)factory.getBean("DefaultHello");
		System.out.println(helloservice.sayHello());
	}

}
