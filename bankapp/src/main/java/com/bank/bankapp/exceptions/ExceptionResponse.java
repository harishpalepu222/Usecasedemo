package com.bank.bankapp.exceptions;

public class ExceptionResponse {

	private String message;
	private String details;
	private String timestamp;
	
	public ExceptionResponse(String message, String details, String timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "BankException [message=" + message + ", details=" + details + ", timestamp=" + timestamp + "]";
	}
	
	

}
