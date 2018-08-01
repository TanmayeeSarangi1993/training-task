package com.training.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.training.spring.HelloService;

public class Client {
public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml","spring-context1.xml");
	Employee employee1 = context.getBean("employee",Employee.class);
	
	System.out.println("hashcode");
	System.out.println("Emp Id" + employee1.getEmpId());
	System.out.println("Emp Salary" + employee1.getEmpSal());
System.out.println("Emp Name" + employee1.getEmpName());
	
	System.out.println("----------------");
	
	
	HelloService service  = (HelloService)context.getBean("DefaultHello");
	
	
	
	//Employee employee = context.getBean("employee",Employee.class);
	
	//System.out.println("Emp Id" + employee.getEmpId());
	//System.out.println("Emp Salary" + employee.getEmpSal());
//System.out.println("Emp Name" + employee.getEmpName());
context.registerShutdownHook();
}
}
