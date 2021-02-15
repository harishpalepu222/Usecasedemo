package com.bank.bankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.bankapp.entity.TransactionStatus;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionStatus, Integer> {

	@Query("SELECT t from TransactionStatus t where t.transactionId=:transactionId")
	public TransactionStatus getTransactionStatus(@Param("transactionId")Long transactionId);
	
	@Query("SELECT t from TransactionStatus t where t.serviceName=:serviceName and t.status in (:status)")
	public List<TransactionStatus> getTransactionwithService(@Param("serviceName")String serviceName, @Param("status")List<String> status);


}
