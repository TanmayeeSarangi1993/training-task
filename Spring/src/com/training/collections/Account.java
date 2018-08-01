package com.training.collections;

import java.util.Map;

public class Account {
   private Map<String,Long> account;

@Override
public String toString() {
	return "Account [account=" + account + "]";
}


public Map<String, Long> getAccount() {
	return account;
}

public void setAccount(Map<String, Long> account) {
	this.account = account;
}
}
