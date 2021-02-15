package com.bank.bankapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.bankapp.entity.Services;


@Repository
public interface ServiceRepository extends CrudRepository<Services, Integer> {


	@Query("SELECT t from Services t WHERE t.serviceName=(:serviceName)")
	public Services findByserviceName(@Param("serviceName") String serviceName);
}
