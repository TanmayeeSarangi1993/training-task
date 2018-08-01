package com.training.bridge;

public class Pentagon extends Shape{
	public Pentagon(IColor color) {
		// TODO Auto-generated constructor stub
		super(color);
	}
	
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Pentagon is applied with color "+getColor());
		getColor().applyColor();
	}
}
