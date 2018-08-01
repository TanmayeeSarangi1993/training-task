package com.training.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeClient {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("db-context.xml");
		
		IEmployeeDAO employeeDao = (IEmployeeDAO)context.getBean("employeeDaoTemplate");
		
		
		Employee employee1= new Employee(101, "Goutam", 50000);
		Employee employee2= new Employee(102, "Akshay", 60000);
		Employee employee3= new Employee(103, "Chandni", 70000);
		Employee employee4= new Employee(104, "Tanmayee", 80000);
		Employee employee5= new Employee(105, "Bhawna", 90000);
		
//		employeeDao.insertEmployee(employee1);
//		employeeDao.insertEmployee(employee2);
//		employeeDao.insertEmployee(employee3);
//		employeeDao.insertEmployee(employee4);
//		employeeDao.insertEmployee(employee5);

		
		
		Employee emp= employeeDao.getEmployee(101);
		Employee emp1= employeeDao.getEmployee(102);

		System.out.println(emp);
		System.out.println(emp1);

		
		
		System.out.println("----------------------------------- all emp -------------------------------------");
		
		List<Employee> list = employeeDao.getAllEmps();
		
		
Iterator<Employee> it= list.iterator();	

while(it.hasNext())
{
	System.out.println(it.next());}		
		
	//	list.forEach(System.out :: println);
		
		
		

		
		
	}

}
