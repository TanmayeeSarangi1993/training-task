package com.training.filter;

import java.util.List;

public class OrCriteria implements iCriteria{

	private iCriteria first;
	private iCriteria second;
	
	public OrCriteria(iCriteria first,iCriteria second) {
		this.first=first;
		this.second=second;
	}

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> list=first.meetCriteria(person);
		return second.meetCriteria(person);
	}

}
