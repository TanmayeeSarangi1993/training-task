package com.study.observer;

public interface TradeStream {
	
	
	public void add(Observer observer);
	
	public void remove(Observer observer);
	
	public void notifyObserver();

	

}
