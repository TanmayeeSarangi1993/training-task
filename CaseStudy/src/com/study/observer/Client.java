package com.study.observer;


public class Client {
	
	
	public static void main(String[] args) {
		
		
		TradeStream fileTradeStream = new FileTradeStream();

		System.out.println("ConsoleStockTicker**********************");
		Observer ob1= new ConsoleStockTicker(fileTradeStream,"A1" );
		Observer ob2= new ConsoleStockTicker(fileTradeStream,"A2" );	
		Observer ob3= new ConsoleStockTicker(fileTradeStream,"A3" );
		Observer ob4= new ConsoleStockTicker(fileTradeStream,"A4" );
		Observer ob5= new ConsoleStockTicker(fileTradeStream,"A5" );
		
		
		
		fileTradeStream.add(ob1);
		fileTradeStream.add(ob2);
		fileTradeStream.add(ob3);
		fileTradeStream.add(ob4);
		fileTradeStream.add(ob5);
		System.out.println(" file TradeStream "+fileTradeStream);
		Subject sub=(Subject) new VolumeStockTicker(fileTradeStream,"VolumeStock");
		System.out.println("sub="+sub+" file TradeStream "+fileTradeStream);
		((FileTradeStream)fileTradeStream).setArrivedTrade(true,sub);

		
		
		
		TradeStream webTradeStream = new WebTradeStream();

		
		Observer ob11= new ConsoleStockTicker(webTradeStream,"A11" );
		Observer ob22= new ConsoleStockTicker(webTradeStream,"A22" );	
		Observer ob33= new ConsoleStockTicker(webTradeStream,"A33" );
		Observer ob44= new ConsoleStockTicker(webTradeStream,"A44" );
		Observer ob55= new ConsoleStockTicker(webTradeStream,"A66" );
		
		
		Subject sub1=new WebTradeStream();
		webTradeStream.add(ob11);
		webTradeStream.add(ob22);
		webTradeStream.add(ob22);
		webTradeStream.add(ob44);
		webTradeStream.add(ob55);
		
		((WebTradeStream)webTradeStream).setArrivedWeb(true,sub1);
		
		
		

		
		
	}
	
	
	
	
	
	
	
	

}
