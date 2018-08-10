package com.Design.Factory;
//if this this is noot made static everuytime we have to call instance is created
//it is loaded in the heap which is run costly
//these type of method is called as resourse intensive
public class FactoryProducer {
 public static AbstractFactory getFactory(String factoryName) {
	 if(factoryName.equals("vehicle")) {
		 return new VehicleFactory();
	 }else if(factoryName.equals("color")) {
		 return new ColorFactory();
	 }
	 
	return null;
	 
 }
}
