package com.springBoot.repository;

import com.springBoot.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer>{
//    public List<Login> findById(String username);
}
