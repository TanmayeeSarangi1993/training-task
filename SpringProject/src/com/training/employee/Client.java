package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springbasics.HelloService;

public class Client {
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("employee-context.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-content.xml","employee-context.xml");
		
		Employee employee= context.getBean("helloEmployee",Employee.class);
		
		System.out.println(employee.getEmpName() +" is a good boy");
		
		
		
		HelloService helloService= (HelloService) context.getBean("defaultHello");
		
		
		System.out.println(helloService.sayHello());
		
		context.registerShutdownHook();
 
		
	}
	

}
