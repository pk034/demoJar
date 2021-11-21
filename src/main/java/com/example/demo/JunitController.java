package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JunitController {
    
	@Autowired
	JunitService jservice;
	
	@GetMapping("/getUser")
	public String getUser() {
		return jservice.getUser();
	}
}
