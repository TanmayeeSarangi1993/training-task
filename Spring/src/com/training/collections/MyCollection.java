package com.training.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {

	 private List questionBank;
	 private AddressSet addressSet;
	 private Account account;
	public List getQuestionBank() {
		return questionBank;
	}
	public void setQuestionBank(List questionBank) {
		this.questionBank = questionBank;
	}
	public AddressSet getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(AddressSet addressSet) {
		this.addressSet = addressSet;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "MyCollection [questionBank=" + questionBank + ", addressSet=" + addressSet + ", account=" + account
				+ "]";
	}
	 

	
}
