package com.training.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle(new Red());
		triangle.applyColor();
		
		Shape Pentagon = new Pentagon(new Blue());
		Pentagon.applyColor();
	}

}
