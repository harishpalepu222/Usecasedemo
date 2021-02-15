package com.bank.bankapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.bankapp.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	@Query("SELECT t FROM Customer t WHERE t.customerId=:customerId")
	public Customer getCustomerById(@Param("customerId")int customerId);
}
