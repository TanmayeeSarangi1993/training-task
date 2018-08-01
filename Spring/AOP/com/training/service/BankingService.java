package com.training.service;

import javax.management.RuntimeErrorException;

import com.training.model.CAAccount;
import com.training.model.SBAccount;

public class BankingService {

private SBAccount sbAccount;
private  CAAccount account;
public SBAccount getSbAccount() {
	return sbAccount;
}
public void setSbAccount(SBAccount sbAccount) {
	this.sbAccount = sbAccount;
}
public CAAccount getAccount() {
	return account;
}
public void setAccount(CAAccount account) {
	this.account = account;
}
@Override
public String toString() {
	return "BankingService [sbAccount=" + sbAccount + ", account=" + account + "]";
}


public String setAndGet(String name) {
	return "Hello Mr/Mrs/Ms " + name;
}


public void throwSomeException() {
	int a = 1;
	if(a == 1) {
		throw new RuntimeException("user threw exception");
	}
	System.out.println("user is ok with value");
	
}
}
