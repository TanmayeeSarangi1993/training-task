package com.training.model;

public class SBAccount {
  private Account acc;

public Account getAcc() {
	return acc;
}

public void setAcc(Account acc) {
	this.acc = acc;
}

@Override
public String toString() {
	return "SBAccount [acc=" + acc + "]";
}

public double showbalance() {
	   return acc.getBalance();
}

  
}
