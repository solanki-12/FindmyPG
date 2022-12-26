package com.springBoot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.model.Registration;
import com.springBoot.repository.UserRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository userRepo;
	
	
//	//Get
//	public List<Registration> getdetails()
//	{
//		List<Registration> registration = new ArrayList<>();
//		userRepo.findAll().forEach(details -> registration.add(details));
//		
//		
//		return registration;
//	}
//	

	
//	public void changePassword(String email,String newpassword)
//	{
//		Registration regist = new Registration();
//		String regist1 = userRepo.findByEmail(email).getPassword();
//		
//		
//		
//		
//	}
}
