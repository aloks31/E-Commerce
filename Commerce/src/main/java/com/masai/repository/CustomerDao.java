package com.masai.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;

public interface CustomerDao  extends JpaRepository<Customer, Integer>{

	
	public Customer findByemail(String email);
	
	public Optional<Customer> findBymobilenumber(String mobileNumber) throws CustomerException;

	
}

