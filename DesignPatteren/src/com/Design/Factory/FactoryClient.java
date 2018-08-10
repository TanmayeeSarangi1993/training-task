package com.Design.Factory;

public class FactoryClient {
public static void main(String[] args) {
	
Car car3 = Car.getCar(CarName.AUDI);
car3.drive();

Car car4 = Car.getCar(CarName.MARUTI);
  car4.drive();


}
}
