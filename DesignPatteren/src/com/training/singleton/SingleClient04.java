package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingleClient04 {
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	 Singleton singleton = Singleton.getInstance();
	 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Sample.ser"));
	 
	out.writeObject(singleton);
	
	System.out.println("Object Saved hashcode"+singleton);
	out.close();
	/////deserializable////////
	 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Sample.ser"));
	 Singleton singletonI2 = (Singleton) ois.readObject();
	 ois.close();

		System.out.println("Object received with hashcode"+singletonI2);
	 
	
}
}
