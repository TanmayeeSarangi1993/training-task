package com.MVC;

public class StarView {
   public void printEmployee(Employee employee) {
	   System.out.println("----------------");
	   System.out.println("EmployeeId " + employee.getEmpId());
	   System.out.println("Employee Name " + employee.getEmpName());
	   System.out.println("----------------");
   }
}
