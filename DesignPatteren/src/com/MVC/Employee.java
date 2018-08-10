package com.MVC;

public class Employee {
  private int empId;
  private String empName;
public int getEmpId() {
	return empId;
}
public Employee() {
	
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
  
  
}
