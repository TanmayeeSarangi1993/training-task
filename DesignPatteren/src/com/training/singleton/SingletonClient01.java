package com.training.singleton;

//showing eager singleton
public class SingletonClient01 {
public static void main(String[] args) {
	
	//it will give the storage location
	Singleton singleton = Singleton.getInstance();
 System.out.println(singleton.hashCode());	
 
  singleton = Singleton.getInstance();
 System.out.println(singleton.hashCode());	
 
 singleton = Singleton.getInstance();
 System.out.println(singleton.hashCode());	

}
}
