package com.Design.Factory;

public class Client {
public static void main(String[] args) {
	AbstractFactory vehicleFactory =FactoryProducer.getFactory("vehicle");
	IColor redColor =FactoryProducer.getFactory("color").getColor("red");
	IColor blueColor =FactoryProducer.getFactory("color").getColor("blue");
	
	
	IVehicle fordCar = vehicleFactory.getVehicle("car");
	fordCar.move();
	fordCar.speed(120);
	fordCar.paintColor(redColor);
	
	IVehicle manTruck = vehicleFactory.getVehicle("truck");
	manTruck.move();
	manTruck.speed(65);
	manTruck.paintColor(blueColor);

	
	
	  
	
	
	
 }
}
