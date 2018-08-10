package com.training.Composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
      private int cusId;
      private String cusName;
      private List<Customer> Referance;
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", Referance=" + Referance + "]";
	}
	public Customer(int cusId, String cusName) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		Referance = new ArrayList<>();
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public List<Customer> getReferance() {
		return Referance;
	}
	public void setReferance(List<Customer> referance) {
		Referance = referance;
	}
public void addReferance(Customer customer) {
	this.Referance.add(customer);
}

public void removeReferance(Customer customer) {
	this.Referance.remove(customer);
}

}
