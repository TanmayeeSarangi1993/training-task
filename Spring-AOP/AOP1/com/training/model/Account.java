package com.training.model;

public class Account {
 private int accNo;
 private String accName;
 @Override

 public String toString() {
	return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
}

 
 public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
private double balance;
}
