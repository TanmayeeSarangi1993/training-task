package com.MVC;

public class Client {
public static void main(String[] args) {
	//this comes from DB
	Employee employee = new Employee(101,"Divya");
	StarView view = new StarView();
	
	EmployeeController controller = new EmployeeController(employee,view);
	controller.updateView("star");
}

private static Employee retrive() {
	return new Employee(101,"Divya");
}
}
