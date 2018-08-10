package com.training.singleton;
//lazy singleton
class company{
	private company() {
		System.out.println("constructor called..");
	}
	public static company getInstance(company company) {
		if(company==null) {
			return new company();		}
		return company;
	}
}

class Emp{
	int empId;
	String name;
	company company;
}
public class SingletonClient02 {
	public static void main(String[] args) {
		//we cann't create an instance variable
		//company company = new company
		company company = null;
		company = company.getInstance(company);
		
		Emp emp1 = new Emp();
		emp1.empId=101;
		emp1.name="Ankit";
		emp1.company=company;
		System.out.println(emp1.company.hashCode());
		
		Emp emp2 = new Emp();
		emp2.empId=102;
		emp2.name="Akshya";
		emp2.company=company;
		System.out.println(emp2.company.hashCode());
		
		
		
		
	}

}
