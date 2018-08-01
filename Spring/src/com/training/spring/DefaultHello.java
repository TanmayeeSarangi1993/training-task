package com.training.spring;

public class DefaultHello implements HelloService {
private String name;
private String city;
public DefaultHello() {
	
}
public DefaultHello(String name, String city) {
	super();
	this.name = name;
	this.city = city;
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
@Override
public String sayHello() {
	// TODO Auto-generated method stub
	return sayHello(name, city);
}

//value given by configure files
@Override
public String sayHello(String name, String city) {
	// TODO Auto-generated method stub
	
	String myStrs[] = {
			"hey how are you Mr/Ms/Mrs %s & How is you city %s","good morning %s","Mr/Ms %s","ur city is btiful %s"
	};
	int randomNumber = (int)(Math.random() * 3);
	return String.format(myStrs[randomNumber], name,city);
}




public void ginit() {
	System.out.println("global init for employee");

}
public void gdestroy() {
 System.out.println("global destroy for employee");
}
}
