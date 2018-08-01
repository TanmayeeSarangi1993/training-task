package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public  class Male implements iCriteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		// TODO Auto-generated method stub
		
		
		List<Person> male = new ArrayList<Person>();
		
		for(Person temp: person) {
			if(temp.getSex().equals("male")){
				male.add(temp);
			}
		}
		return male	;
	}
}

	
