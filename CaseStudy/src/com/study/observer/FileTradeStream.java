package com.study.observer;

import java.util.ArrayList;
import java.util.List;

public class FileTradeStream implements TradeStream,Subject{
	
	
	private List<Observer> observerList;
	private boolean isArrived=true;
	Subject sub;
	
	public  FileTradeStream() {
		// TODO Auto-generated constructor stub
		
		observerList=new ArrayList<Observer>();
	}
	

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		
		observerList.add(observer)
;		
		
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub		
		observerList.remove(observer);

		
		
		
	}

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		
		
		observerList.add(observer)
		;		
		
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		
		observerList.remove(observer);
		
	}



		
		
		
		
		



	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(Observer temp : observerList) {
			
			
			temp.update(sub);
			
			
		}
		
		
	}


	public void setArrivedTrade(boolean isArrived,Subject subject) {
		sub=subject;
		this.isArrived=isArrived;
		notifyObserver();
		
	}
	
	

	
	

}
