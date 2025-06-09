package com.motosimagab.sprbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motosimagab.sprbootproject.entities.Order;

// JpaRepository já tem a anotação @repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
