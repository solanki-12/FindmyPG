package com.springBoot.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBoot.model.Registration;
import com.springBoot.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class HomeControllerLogin {

	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/home")
	public String home(Principal p, Model model){
		
		String em=p.getName();
		Registration reg =repo.findByEmail(em);
		
		model.addAttribute(reg.getFirstname());
	    model.addAttribute(reg.getLastname());
	    model.addAttribute(reg.getPhone());
	    model.addAttribute("em",reg.getEmail());
	    model.addAttribute(reg.getConfirmpassword());
	    
//	    if(reg.getEmail()==username && reg.getConfirmpassword()==password)
//	    {
//	    
//	    }
		return "ownerHome";
}
}