package com.motosimagab.sprbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motosimagab.sprbootproject.entities.Product;

// JpaRepository já tem a anotação @repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
