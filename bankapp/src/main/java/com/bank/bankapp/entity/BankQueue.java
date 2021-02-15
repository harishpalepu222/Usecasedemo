package com.bank.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankqueue")
public class BankQueue {
	

	private Integer tokenId;
	@Id
	private String serviceName;
	
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getTokenId() {
		return tokenId;
	}
	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}
	@Override
	public String toString() {
		return "BankQueue [serviceName=" + serviceName + ", tokenId=" + tokenId + "]";
	}

}
