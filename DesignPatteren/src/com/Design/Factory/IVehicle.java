package com.Design.Factory;

public interface IVehicle {
	void move();
	void speed(int maxSpeed);
	void paintColor(IColor string);

}

class car1 implements IVehicle{
	public void move() {
		System.out.println("car is moving");
	}
	public void speed(int maxSpeed) {
		System.out.println("Max speed is"+ maxSpeed);
	}
	public 	void paintColor(IColor string)
 {
		string.paintCar();
	}
}
	class Truck implements IVehicle{
		public void move() {
			System.out.println("truck is moving");
		}
		public void speed(int maxSpeed) {
			System.out.println("Max speed is"+ maxSpeed);
		}
		public 	void paintColor(IColor string)
		 {
				string.paintCar();
			}}
