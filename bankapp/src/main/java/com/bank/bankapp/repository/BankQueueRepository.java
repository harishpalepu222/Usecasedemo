package com.bank.bankapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.bankapp.entity.BankQueue;


@Repository
public interface BankQueueRepository extends CrudRepository<BankQueue, Integer> {

	@Query("SELECT t from BankQueue t where t.serviceName=:serviceName")
	public BankQueue getToken(@Param("serviceName") String serviceName);

}
