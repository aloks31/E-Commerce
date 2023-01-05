package com.masai.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.exception.OrderExcetion;
import com.masai.model.Orders;

public interface Orderdao  extends JpaRepository<Orders, Integer>{

	public List<Orders> findByorderDate(LocalDate date) throws  OrderExcetion;
	
}

