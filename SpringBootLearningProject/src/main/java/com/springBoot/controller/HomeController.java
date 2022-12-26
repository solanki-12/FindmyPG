package com.springBoot.controller;

import com.springBoot.Service.LoginData;
import com.springBoot.model.Registration;
import com.springBoot.repository.PropertyDataRepository;
import com.springBoot.repository.UserRepository;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{

	
    @Autowired // To create an object of the interface without using the new keyword to save the memory allocation;
    LoginData loginData;

    
    @Autowired
    UserRepository regRepo;

   @GetMapping("/login")
   // @RequestMapping("/")
    public String login()
    {
	          return "first";
    }
   
   
   
//   
//   @RequestMapping("/checklogin")
//   public String homePage(Model m,@RequestParam("usertype") String usertype,HttpSession session)
//   {
//
//	   
////	   
////	   m.addAttribute("usertype", regRepo.findAll());
////	   System.out.println(m);
////	   
////	   if(usertype==hasErrors())
////	   {
////		   System.out.println(result);
////		   return "first";
////	   }
////	   System.out.println(logindata);
//	   return"ownerHome";
//   }
   

    @RequestMapping(value="/ownerhome",method = RequestMethod.GET)
   // @RequestMapping("/")
    public String ownerHome()
    {
        return "ownerHome";
    }
    
    

//    
//    @RequestMapping("/save")
//    public String login(@RequestParam("userid") String username, @RequestParam("password") String password)
//    {
//        loginData.saveData(username,password);
//        return "Login";
//
//    }

}
