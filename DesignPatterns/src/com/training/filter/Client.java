package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {
  public static void main(String[] args) {
	List<Person> list = new ArrayList<Person>();
	
	list.add(new Person("Lohit" ,"male","single"));
	list.add(new Person("Lohit" ,"male","Married"));
	list.add(new Person("M" ,"male","Married"));
	list.add(new Person("K" ,"female","single"));
	list.add(new Person("MQ" ,"female","single"));
	list.add(new Person("F" ,"male","Married"));
	list.add(new Person("H" ,"female","single"));
	list.add(new Person("G" ,"male","Married"));
	list.add(new Person("W" ,"female","single"));
	list.add(new Person("J" ,"male","Married"));
	
	iCriteria maleCriteria = new Male();	
	iCriteria femaleCriteria = new Female();
	iCriteria singleCriteria = new Single();
	iCriteria marriedCriteria = new Married();
	

	System.out.println("-------------only male-------------");
	maleCriteria.meetCriteria(list).forEach(System.out::println);
	
	System.out.println("----for female------");
	
	System.out.println("-------------only male-------------");
	femaleCriteria.meetCriteria(list).forEach(System.out::println);
	
	
	
	System.out.println("-------------only single------------");
	singleCriteria.meetCriteria(list).forEach(System.out::println);
	
	

	System.out.println("-------------only MARRIED------------");
	marriedCriteria.meetCriteria(list).forEach(System.out::println);
	
	
	System.out.println("----male ans single---------");
	iCriteria andCriteria=new AndCriteria(maleCriteria,singleCriteria);
	andCriteria.meetCriteria(list).forEach(System.out::println);

	
	System.out.println("----male or single--------");
	iCriteria orCriteria=new OrCriteria(maleCriteria,singleCriteria);
	orCriteria.meetCriteria(list).forEach(System.out::println);
}
}
