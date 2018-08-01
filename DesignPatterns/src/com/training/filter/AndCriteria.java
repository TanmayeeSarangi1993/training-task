package com.training.filter;

import java.util.List;

public class AndCriteria implements iCriteria{
	
	private iCriteria firstCriteria;
	private iCriteria secondCriteria;
	
	public AndCriteria(iCriteria firstCriteria,iCriteria secondCriteria) {
		this.firstCriteria=firstCriteria;
		this.secondCriteria=secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> list=firstCriteria.meetCriteria(person);
		return secondCriteria.meetCriteria(list);
	}

}
