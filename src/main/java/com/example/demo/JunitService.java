package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JunitService {
	
	/*
	 * @Autowired ComUsersRepository cu;
	 */
	
	public String getUser() {
		
//		ComUser cr=new ComUser("pk",9443903514L); 
		//cu.save(cr);
		return "user";
	}
	
}

