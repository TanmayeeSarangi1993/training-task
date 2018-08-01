package com.training.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		BankingService bnkser = (BankingService) context.getBean("Banking",BankingService.class);
		
		System.out.println(bnkser.getSbAccount().getAcc());
		System.out.println(bnkser.getAccount().showbalance());
         bnkser.getAccount().getOneParameter(100);
         
         
         String  retVal = bnkser.setAndGet("Harry");
         System.out.println("return Val in main"+retVal);
         
         //bnkser.throwSomeException();
       
	}

}
