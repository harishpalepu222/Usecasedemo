package com.bank.bankapp.exceptions;

public class BankException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public String message;
	public String details;	

	public BankException(String message, String details) {
		super();
		this.message = message;
		this.details = details;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
