package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.model.Registration;

public interface UserRepository extends JpaRepository<Registration, Integer>{

	public Registration findByEmail(String em);
}
