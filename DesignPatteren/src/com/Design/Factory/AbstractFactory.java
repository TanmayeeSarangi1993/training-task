package com.Design.Factory;

public  abstract class AbstractFactory {
	
	public abstract IVehicle getVehicle(String vehicle);
	public abstract IColor getColor(String color);

}
