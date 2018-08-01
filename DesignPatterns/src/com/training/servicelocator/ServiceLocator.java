package com.training.servicelocator;

public class ServiceLocator {
  private static Cache cache;
  
  static {
	  cache = new Cache();
  }
  
  public static Service getService(String jndName) {
	  Service service = cache.getService(jndName);
	  if(service != null) {
		  System.out.println("from cache");
		  return service;
	  }
	  InitialContext context = new InitialContext();
	  Service nservice = (Service)context.lookup(jndName);
	  cache.addService(nservice);
	  return nservice;
  }
  
}
