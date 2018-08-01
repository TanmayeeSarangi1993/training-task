package com.training.BeanPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.Employee.Employee;

//if u want to spring to knw dis z post procesor.....
//implmnt beanprocessor,dis way every bean
//when crt by spring has to go through dis class
//since dis class can handle any class all r given as object
public class EmployeeBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("posprocessor after initialisazation  "+arg1+"*******");
		
		if(arg0 instanceof Employee) {
			Employee emp = (Employee) arg0;
			
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("posprocessor before initialisazation  "+arg1+"*******");
		return arg0;
	}

}
