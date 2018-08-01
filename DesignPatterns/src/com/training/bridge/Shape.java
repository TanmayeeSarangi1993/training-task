package com.training.bridge;

//this shall be treated as abstract class
//since the reference of the color is kept there

//every shape shall have color
public abstract class Shape {
	private IColor color;

	public Shape(IColor color) {
		this.color = color;
	}

	public abstract void applyColor();

	protected IColor getColor() {
		return color;
	}

}
