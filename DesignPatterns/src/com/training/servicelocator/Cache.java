package com.training.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
 private List<Service> services;
  public Cache() {
	  services = new ArrayList<Service>();
  }
  public Service getService(String serviceName) {
	  for(Service service : services) {
		  if(service.getName().equalsIgnoreCase(serviceName)) {
			  System.out.println("return" + serviceName+"object");
			  return service;
		  }
	  }
	 return null;
  }
  
  
  public void addService(Service newService) {
	  boolean exists = false;
	  if(services.isEmpty()) services.add(newService);
	  
	  for(int i=0;i<services.size();i++) {
		  System.out.println("current service" + services.get(i).getName()+",req" + newService.getName());
		  if(services.get(i).getName().equalsIgnoreCase(newService.getName())) {
			  exists = true;
		  }
		  if(!exists)
		  {
			  services.add(newService);
		  }
		  
	  }
  }
}
