package com.training.observe;

import com.sun.javafx.collections.ImmutableObservableList;

public class User implements IObserver {
	
	private IObervable observable = null;
	private String name;

	
	
	public User(IObervable observable,String name) {
		this.observable = observable;
		this.name = name;
	}
	
	public void BuyMobile() {
		System.out.println("mobile oneplus6T" + name);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		BuyMobile();
	}
	public void Unscribe() {
		// TODO Auto-generated method stub
		observable.remove(this);
	}

}
