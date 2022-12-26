package com.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentHomeController {
	

    @RequestMapping("/studenthome")
    public String studenthome()
    {
    	return"StudentHomepage";
    }  
    
}
