package com.training.bridge;

public class Triangle extends Shape{
	public Triangle(IColor color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Triangle is applied with color "+getColor());
		getColor().applyColor();
	}
}
