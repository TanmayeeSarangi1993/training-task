package com.training.observe;

import java.util.stream.Stream;

public class Client {
public static void main(String[] args) {
	IObervable obsevable = new OnePlus6T();
	
	
Stream.of( new User(obsevable,"alla"),
 new User(obsevable,"kamel"),
 new User(obsevable,"lohir"),
 new User(obsevable,"mohan"),
 new User(obsevable,"nitesh")).forEach(obsevable::addUser);


((OnePlus6T)obsevable).setArrived(true);


IObervable obsevable1 = new Apple();


Stream.of( new User(obsevable,"alla"),
 new User(obsevable,"kamel"),
 new User(obsevable,"lohir"),
 new User(obsevable,"mohan"),
 new User(obsevable,"nitesh")).forEach(obsevable::addUser);


((Apple)obsevable).setArrived(true);

}
}
