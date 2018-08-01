package com.trainings.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Value("${mobile.camType}")
	private String type;
	
	
	public Camera() {
		
		System.out.println("camera constructor"+this);
		
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
