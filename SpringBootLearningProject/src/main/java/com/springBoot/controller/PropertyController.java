package com.springBoot.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springBoot.Service.AddPropertyService;
import com.springBoot.model.AddProperty;
import com.springBoot.repository.PropertyDataRepository;

//import com.springBoot.model.PropertyModel;
//import com.springBoot.repository.PropertyDataRepository;

@Controller
public class PropertyController {

	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
	
    @Autowired
    PropertyDataRepository propertydataRepo;
	
	@Autowired
    AddPropertyService fileUpload;
	
	@GetMapping("/prop")
	public String property()
	{
		return "/addproperty.html";
	}
	
	


	
	
	
	@RequestMapping("/saveProp")
	public String saveProperty(@RequestParam("file") MultipartFile file,@ModelAttribute AddProperty ap,HttpSession session)
	{
		if(!file.isEmpty())
        {
            String fileName=file.getOriginalFilename();
            fileUpload.uploadFile(file);

            String url = ServletUriComponentsBuilder.fromCurrentContextPath().path("/uploadImage/").path(file.getOriginalFilename()).toUriString();
            ap.setFileName(fileName);
            ap.setUrl(url);
        }
		
		propertydataRepo.save(ap);
		session.setAttribute("message", "Details added Successfully !!");
		
		return "/addproperty";
		
	}
	
	

	
//	@GetMapping("/addproperty.html")
//	public String showExampleView(Model model)
//	{
//		List<Product> products = productRepo.findAll();
//		model.addAttribute("products", products);
//		return "/addproperty.html";
//		
//	}
}
