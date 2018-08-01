package com.generics.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

public class EmployeeBeanProcessor implements BeanPostProcessor{
	
	// if you want spring to know this is post processor
	//implements BeanPostProcessor , this way every bean
	//when created by spring has 
	

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("******** Post Process After Initialization "+arg0+"   "+arg1);
		
		if(arg0 instanceof Employee){
			
			Employee emp=(Employee) arg0;
			
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
			
		}
		
		
		
		return arg0;
	}
	

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		
		// TODO Auto-generated method stub
		
		System.out.println("******** Post Process Before Initialization "+arg0+"   "+arg1);

		return arg0;
	}
	

}
