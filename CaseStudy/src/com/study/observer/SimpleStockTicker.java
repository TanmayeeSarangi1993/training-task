package com.study.observer;

public class SimpleStockTicker  implements Observer{
	
	
	private TradeStream tradeStream=null;
	private Subject subject=null;
	
	private String name;
	
	


	public SimpleStockTicker(TradeStream tradeStream, String name) {
		super();
		this.tradeStream = tradeStream;
		this.name = name;
	}

	public SimpleStockTicker(Subject subject, String name) {
		super();
		this.name = name;
		this.subject = subject;
	}





	@Override
	public void update(Subject subject) {
		
		System.out.println("stock exchange has been updated");
		
		
		
	}
	
	
	
	
	

}
