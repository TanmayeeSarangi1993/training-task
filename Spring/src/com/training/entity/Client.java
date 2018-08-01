package com.training.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.DAO.EmployeeDAO;
import com.training.Helloi18n.AppConfig;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("db-context.xml");
		
		
		EmployeeDAO employeeDao =context.getBean("employeeDaoTemplate",EmployeeDAO.class);
		//insert
		// Employee emp = new Employee(103,"tanu",2100);
		// emp1 = new Employee(102,"Goutam",23000);
		// Employee emp2 = new Employee(101,"Chandni",24000);
		// Employee emp3 = new Employee(104,"Sidharth",25000);
		 
		 
		// employeeDao.insertEmployee(emp);
		// employeeDao.insertEmployee(emp1);
		 //employeeDao.insertEmployee(emp2);
		 //employeeDao.insertEmployee(emp3);
		 
		 
		 //Employee emp = employeeDao.getEmployee(101);
		// System.out.println(emp);
		
		
	//	Employee emp = employeeDao.getAllEmps();
		
	}

}
