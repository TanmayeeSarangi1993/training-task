package com.trainings.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SPeaker {
	
	@Value("${mobile.sptype}")
	private String type;
	
	@Value("${mobile.volLvl}")
	private int volLevels;
	
	public SPeaker() {
		
		System.out.println("Creating speaker "+this);
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVolLevels() {
		return volLevels;
	}

	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	
	
	
	

}
