package com.training.employee;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	public Employee()
	{
		
		System.out.println();
		
	}	
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
	public int getEmpId() {
		return empId;
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
	
	public void init() {
		
		System.out.println("init for employee");
		
	}
	private void destroy() {
		System.out.println("destroy for employee");
	}
	
	
	
	public void ginit() {
		
		System.out.println("global init for employee");
		
	}
	private void gdestroy() {
		System.out.println("global destroy for employee");
	}
	
	

}
