package com.training.filter;

import java.util.ArrayList;
import java.util.List;

	public  class Female implements iCriteria {

		@Override
		public List<Person> meetCriteria(List<Person> person) {
			// TODO Auto-generated method stub
			
			
			List<Person> female = new ArrayList<Person>();
			
			for(Person temp: person) {
				if(temp.getSex().equals("female")){
					female.add(temp);
				}
			}
			return female	;
		}

		

	}
