package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//program to access singleton(eager) through reflection
public class SngletonClient03 {
 public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	 Singleton singletonI1 = Singleton.getInstance();
	 Singleton singletonI2 = null;
	 Singleton singletonI3= null;
	
	 Constructor [] constructor = Singleton.class.getDeclaredConstructors();
	 
	 for(Constructor constructor1 : constructor) {
		 //here we can access the private methods
		 constructor1.setAccessible(true);
		 singletonI2 =(Singleton) constructor1.newInstance();
		 singletonI3 =(Singleton) constructor1.newInstance();
		 break;
	 }
	 
	 System.out.println("Instance one - hashcode" + singletonI1);
	 System.out.println("Instance one - hashcode" + singletonI2);
	 System.out.println("Instance one - hashcode" + singletonI3);
}
}
