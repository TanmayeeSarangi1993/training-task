package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Single implements iCriteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		// TODO Auto-generated method stub
		
         List<Person> single = new ArrayList<Person>();
		
		for(Person temp: person) {
			if(temp.getMaterialStatus().equals("single")){
				single.add(temp);
			}
		}
		return single	;
	}

	
}