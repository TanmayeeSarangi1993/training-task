package com.Design.Factory;

public class Car {
  public static Car getCar(CarName carName) {
	  if(carName == CarName.MARUTI) {
		  return new Maruti();
	  }else if (carName ==CarName.BMW){
		  return new BMW();
	  }else if(carName ==CarName.AUDI){
		  return new Audi();
  }
	  return null;
}

public void drive() {
	// TODO Auto-generated method stub
	
}
}