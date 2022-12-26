package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.model.AddProperty;


@Repository
public interface PropertyDataRepository extends JpaRepository<AddProperty,Integer>{


}
