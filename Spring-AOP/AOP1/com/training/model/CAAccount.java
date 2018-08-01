package com.training.model;

public class CAAccount {
   private Account account;
   
   
   public Account getAccount() {
		return account;
	}






	public void setAccount(Account account) {
		this.account = account;
	}
   
   
   public double showbalance() {
	   return account.getBalance();
   }







}
