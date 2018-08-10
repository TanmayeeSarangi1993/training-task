package com.Design.Factory;

public class ColorFactory extends AbstractFactory{

	@Override
	public IVehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		if(color.equals("red")) {
			return new Red();
		}else if(color.equals("blue")) {
			return new Blue();
		}
		return null;
	}

}
