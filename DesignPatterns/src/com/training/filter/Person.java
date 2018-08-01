package com.training.filter;

public class Person {
  private String name;
  private String sex;
  private String materialStatus;
  
public Person(String name, String sex, String materialStatus) {
	super();
	this.name = name;
	this.sex = sex;
	this.materialStatus = materialStatus;
}

@Override
public String toString() {
	return "Person [name=" + name + ", sex=" + sex + ", materialStatus=" + materialStatus + "]";
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getMaterialStatus() {
	return materialStatus;
}
public void setMaterialStatus(String materialStatus) {
	this.materialStatus = materialStatus;
}
}
