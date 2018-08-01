package com.training.springbasics;

public class DefaultHello implements HelloService{
	
	private String name;
	private String city;
	
	
	
	public DefaultHello() {
		
		
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}



	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return sayHello(name,city);
	}

	@Override
	public String sayHello(String name, String city) {
		// TODO Auto-generated method stub
		
		
		String myStrs[] = {"Hey how are you Mr/Ms/Mrs %s & How is your city %s","Good Morning %s,are you in %s","Mr/Ms/Mrs %s,your city is beautiful %s"};
		
		int randomNumber = (int) Math.random()*3;
		return String.format(myStrs[randomNumber], name,city);
	}
	
	
	public void ginit() {
		
		System.out.println("global init for Default Hello");
		
	}
	private void gdestroy() {
		System.out.println("global destroy for Default Hello");
	}
	

}
