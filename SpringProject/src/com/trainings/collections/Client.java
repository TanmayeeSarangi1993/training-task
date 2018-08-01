package com.trainings.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collection-content.xml");
		
		MyCollection myCollection = context.getBean("myCollection",MyCollection.class);
		
		
		System.out.println(myCollection.getQuestionBank());
		System.out.println(myCollection.getAddressSet());
		System.out.println(myCollection.getAccountMap());

		
		
		
	}

}
