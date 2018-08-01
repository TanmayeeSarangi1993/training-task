package com.training.servicelocator;
//will work for any service
public class InitialContext {

	public Object lookup(String jndName) {
		if(jndName.equalsIgnoreCase("db")) {
			System.out.println("creating db");
			return new DBService();
		}else if(jndName.equalsIgnoreCase("erp")) {
			System.out.println(" creating ERP");
			return new ERPService();
		}
		return null;
		
	}
}
