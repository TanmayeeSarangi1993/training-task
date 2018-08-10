package com.MVC;

public class EmployeeController {
 private Employee model;
 private StarView starview;
// private DashView dashview;
public Employee getModel() {
	return model;
}
public EmployeeController(Employee model, StarView starview) {
	super();
	this.model = model;
	this.starview = starview;
}
public void setModel(Employee model) {
	this.model = model;
}
public StarView getStarview() {
	return starview;
}
public void setStarview(StarView starview) {
	this.starview = starview;
}
 public void updateView(String viewType) {
	 System.out.println("Showing"+viewType +"view");
	 starview.printEmployee(model);
 }


}
