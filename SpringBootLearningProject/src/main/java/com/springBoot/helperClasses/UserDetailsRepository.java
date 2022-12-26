package com.springBoot.helperClasses;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.model.Registration;

public interface UserDetailsRepository extends JpaRepository<Registration, Integer> {
	

	

}
