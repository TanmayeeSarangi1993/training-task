package com.trainings.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private Camera camera;
	@Autowired
	private Screen screen;
	@Autowired
	private SPeaker speaker;
	
	
	public Mobile() {
		
		System.out.println("Creating Mobile "+this);
		
	}


	public Camera getCamera() {
		return camera;
	}


	public void setCamera(Camera camera) {
		this.camera = camera;
	}


	public Screen getScreen() {
		return screen;
	}


	public void setScreen(Screen screen) {
		this.screen = screen;
	}


	public SPeaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(SPeaker speaker) {
		this.speaker = speaker;
	}
	
	
	
	
}
