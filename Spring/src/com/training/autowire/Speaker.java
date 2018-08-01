package com.training.autowire;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
  private String type;
  private int vollevels;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getVollevels() {
	return vollevels;
}
public void setVollevels(int vollevels) {
	this.vollevels = vollevels;
}
public Speaker() {
	System.out.println("speaker");
}
}
