package com.springBoot.config;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springBoot.model.Registration;

public class CustomUserDetails implements UserDetails {

	private Registration reg;
	

	public CustomUserDetails(Registration reg) {
		super();
		this.reg = reg;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		HashSet<SimpleGrantedAuthority> set = new HashSet<SimpleGrantedAuthority>();
		set.add(new SimpleGrantedAuthority(reg.getRole()));
		return set;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return reg.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return reg.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public String getFirstname()
	{
		return reg.getFirstname();
	}
	
	public String getLastname()
	{
		return reg.getLastname();
	}
	
	public String getPass()
	{
		return reg.getConfirmpassword();
	}
	
	
	public String phone()
	{
		return reg.getPhone();
	}
	
	public String getGender()
	{
		return reg.getGender();
	}




	
}
