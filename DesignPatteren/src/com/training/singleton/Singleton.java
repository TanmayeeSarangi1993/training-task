package com.training.singleton;

import java.io.Serializable;

//singleton - there is only one object
//sothat we will have one static variable
//one referance,in singleton we can have 2 ways
//1.eager singleton  2.lazy singleton
//
public class Singleton implements Serializable {
	
	private static final Singleton instance = new Singleton();
	//we have private constructor so that we shall not call from outside
	private Singleton() {
		System.out.println("this constructor is called");
		
		
	}
	public static Singleton getInstance() {
		return instance;
	}
	
	//to stop creating ib=nstance who create already
	//this is only for input objexct sream class
	protected Object readResolve() {
		return getInstance();
		
	}

}
