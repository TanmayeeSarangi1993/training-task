package com.training.observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Apple  implements IObervable{
private List<IObserver> Users;
private boolean isArrived = true;


public Apple() {
	Users = new ArrayList<>();
}
	public void addUser(IObserver observer) {
		// TODO Auto-generated method stub
		Users.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		// TODO Auto-generated method stub
		Users.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(IObserver temp : Users){
			temp.update();
		}
	}
	public boolean isArrived() {
		return isArrived;
	}
	public void setArrived(boolean isArrived) {
		this.isArrived = isArrived;
		notifyObserver();
	}

}
