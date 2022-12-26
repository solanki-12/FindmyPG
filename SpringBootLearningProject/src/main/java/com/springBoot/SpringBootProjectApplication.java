 package com.springBoot;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springBoot.controller.PropertyController;

@SpringBootApplication
@ComponentScan({"com.springBoot","controller"})
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		new File(PropertyController.uploadDirectory).mkdir();
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
	