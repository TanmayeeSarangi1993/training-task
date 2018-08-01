package com.study.observer;

public class VolumeStockTicker implements Observer{
	
	
	private TradeStream tradeStream=null;
	private Subject subject=null;
	
	
	
	

	private String name;
	
	


	public VolumeStockTicker(TradeStream tradeStream, String name) {
		super();
		this.tradeStream = tradeStream;
		this.name = name;
	}

	public VolumeStockTicker(Subject subject, String name) {
		super();
		this.name = name;
		this.subject = subject;
	}



	@Override
	public void update(Subject subject) {
		System.out.println("update volume stock modfied");
		
		
		
		
	}
	
	
	
	
	

}
