package com.training.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Collection-context.xml");

		MyCollection collection = context.getBean("mycollection", MyCollection.class);
		System.out.println(collection);

	}

}
