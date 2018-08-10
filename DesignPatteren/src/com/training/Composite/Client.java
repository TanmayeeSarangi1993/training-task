package com.training.Composite;

public class Client {
  public static void main(String[] args) {
	Customer customer1 = new Customer(101,"Birendra");
	Customer customer2 = new Customer(102,"Tejaswini");
	Customer customer3 = new Customer(103,"Goutam");
	Customer customer4 = new Customer(104,"Ramu");
	Customer customer5 = new Customer(105,"Anuj");
	Customer customer6 = new Customer(106,"Bhawna");
	Customer customer7 = new Customer(107,"Chandni");
	Customer customer8 = new Customer(108,"Tanmayee");
	Customer customer9 = new Customer(109,"Sidharth");
  

	  customer1.addReferance(customer2);
	  customer1.addReferance(customer3);
	  customer1.addReferance(customer4);
	  
	
	  customer2.addReferance(customer5);
	  customer2.addReferance(customer6);

	 
	  customer3.addReferance(customer7);
	  customer3.addReferance(customer8);
	  customer3.addReferance(customer9);
  
  System.out.println("print================");
  System.out.println("cus ref" + customer1.getReferance());
  
  
  
  for(Customer temp : customer1.getReferance()) {
	  System.out.println(temp.getCusId() + "," + temp.getCusName());
  }
  }
  
}
