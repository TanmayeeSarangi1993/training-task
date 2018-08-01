package com.training.filter;

import java.util.ArrayList;
import java.util.List;

	public class Married implements iCriteria {

		@Override
		public List<Person> meetCriteria(List<Person> person) {
			// TODO Auto-generated method stub
			
	         List<Person> married = new ArrayList<Person>();
			
			for(Person temp: person) {
				if(temp.getMaterialStatus().equals("Married")){
					married.add(temp);
				}
			}
			return married	;
		}

		
	}
