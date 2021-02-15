package com.bank.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name= "transactionstatus")
public class TransactionStatus {
	
	@Id
	@SequenceGenerator(name= "TRAN_SEQUENCE", sequenceName = "TRAN_SEQUENCE_ID", initialValue=10000, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="TRAN_SEQUENCE")
	private Long transactionId;
	
	private Integer tokenId;
	private Integer customerId;
	private String serviceName;
	private Integer amount;
	private String status;
	private String review;
	
	
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getTokenId() {
		return tokenId;
	}
	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TransactionStatus [transactionId=" + transactionId + ", tokenId=" + tokenId + ", customerId="
				+ customerId + ", serviceName=" + serviceName + ", amount=" + amount + ", status=" + status
				+ ", review=" + review + ", getReview()=" + getReview() + ", getTransactionId()=" + getTransactionId()
				+ ", getTokenId()=" + getTokenId() + ", getCustomerId()=" + getCustomerId() + ", getServiceName()="
				+ getServiceName() + ", getAmount()=" + getAmount() + ", getStatus()=" + getStatus() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
