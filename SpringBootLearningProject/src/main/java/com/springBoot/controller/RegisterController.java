package com.springBoot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springBoot.helperClasses.UserDetailsRepository;
import com.springBoot.model.Registration;





@Controller
public class RegisterController {
	

	//Create object of UserRepository interface 

	@Autowired
	private UserDetailsRepository repo;
	
	
	@Autowired
	private BCryptPasswordEncoder bp;
	
	
	
	
	
	
	//Method to get register Form
    @GetMapping("/")
    public String register()
    {
        return "Register";
    }
    
    
    
    
    
    
    
    @PostMapping("/register")
    public String viewRegister(@ModelAttribute Registration reg,Model model, HttpSession session)
    {
    	 
    	System.out.println(reg);
    	reg.setPassword(bp.encode(reg.getPassword()));
    	reg.setRole("ROLE_USER");
    	
    	System.out.println(reg);
    	
    	repo.save(reg);
    	session.setAttribute("message", "Registration Successfully...");
    	return "redirect:/";
    }
    

}
