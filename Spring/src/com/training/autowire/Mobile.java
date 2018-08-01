package com.training.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Mobile {
	@Autowired
  private Camera camera;
	@Autowired
  private Screen screen;
	@Autowired
  private Speaker speaker;
public Mobile() {
	
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

public Speaker getSpeaker() {
	return speaker;
}

public void setSpeaker(Speaker speaker) {
	this.speaker = speaker;
}
}
