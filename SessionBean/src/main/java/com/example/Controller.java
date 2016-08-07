package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{	
	@Autowired
	User user;
	
	@RequestMapping("test")
	public void printDate()
	{
		System.out.println(user);
	}
}
