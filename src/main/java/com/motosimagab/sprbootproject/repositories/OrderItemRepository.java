package com.motosimagab.sprbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motosimagab.sprbootproject.entities.OrderItem;
import com.motosimagab.sprbootproject.entities.pk.OrderItemPK;

// JpaRepository já tem a anotação @repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
