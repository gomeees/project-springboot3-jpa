package com.motosimagab.sprbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motosimagab.sprbootproject.entities.User;

// JpaRepository já tem a anotação @repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
