package com.study.observer;

public class ConsoleStockTicker implements Observer{
	
	
	private TradeStream tradeStream=null;
	
	private Subject subject=null;
	
	private String name;
	
	

	public ConsoleStockTicker(TradeStream tradeStream, String name) {
		super();
		this.tradeStream = tradeStream;
		this.name = name;
	}

	public ConsoleStockTicker(Subject subject, String name) {
		super();
		this.name = name;
		this.subject = subject;
	}




	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		
		getTicker(subject);
		
		
	}
	
	
	
public void getTicker(Subject subject) {
		
		System.out.println("hurry , I have bought "+subject+" , by "+name);
		
	}
	
	
	

}
