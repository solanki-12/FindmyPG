package com.springBoot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBoot.Service.RegistrationService;
import com.springBoot.model.AddProperty;
import com.springBoot.model.Registration;

@Controller
public class MyProfileController {
	
	
	@Autowired
	private RegistrationService regService;
	
	 @GetMapping("/profile")
	   // @RequestMapping("/")
    public String myprofile()
    {
		return "myprofile";
    }

	 
//	 @RequestMapping("/updateprofile")
//	 public String updateProfile(@RequestParam("password") String password, @RequestParam("newpassword") String newpassword,@ModelAttribute Registration reg,HttpSession session)
//	 {
//		String passDB = reg.getConfirmpassword(); 
//		 
//		if(passDB == password)
//		{
//		   reg.setConfirmpassword(newpassword);
//		}
//
//		 return"myprofile";
//
//	 }
	 
	 
//	 @PostMapping("/updateprofile")
//	 public String updatePass(@RequestParam("password")String password,@RequestParam("newpassword") String newpassword,@ModelAttribute Registration reg)
//	 {
//		 
//		 String dbPass = reg.getAddress();
//		 System.out.println(dbPass);
//		 if(dbPass == password)
//		 {
//			reg.setPassword(newpassword);
//			reg.setConfirmpassword(newpassword);
//		 }
//		 System.out.println(newpassword);
////		 regService.changePassword(email, newpassword);
//		 return "redirect:/myprofile.html";
//		
//	 }
}