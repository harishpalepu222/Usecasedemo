package com.bank.bankapp.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name= "customer")

public class Customer {
	
	@Id
	private int customerId;
	
	private String customerName;
	
	private int balance;
	
	@Transient
	private int token;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", balance=" + balance
				+ ", token=" + token + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()="
				+ getCustomerName() + ", getBalance()=" + getBalance() + ", getToken()=" + getToken() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + token;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (balance != other.balance)
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (token != other.token)
			return false;
		return true;
	}
	

}
