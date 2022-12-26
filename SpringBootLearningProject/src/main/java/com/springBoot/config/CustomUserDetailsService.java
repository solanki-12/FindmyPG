package com.springBoot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springBoot.model.Registration;
import com.springBoot.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String em) throws UsernameNotFoundException {
	
		try {
			
		    Registration reg =repo.findByEmail(em);  // Need to check 
			
			if(reg==null)
			{
				throw new UsernameNotFoundException("No user");
			}else
			{
				return new CustomUserDetails(reg);
			}
			
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	

}
