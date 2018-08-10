package com.Design.Factory;

public interface IColor {
	void paintCar();
}
 class Red implements IColor{
	 public void paintCar() {
		 System.out.println("car painting color Red");
	 }
 }
 class Blue implements IColor{
	 public void paintCar() {
		 System.out.println("car painting color Blue");
	 }
 }
