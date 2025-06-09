package com.motosimagab.sprbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motosimagab.sprbootproject.entities.Category;

// JpaRepository já tem a anotação @repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
