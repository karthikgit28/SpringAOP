package com.aop.example.AOPDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public void returnUser() {
		System.out.println("New call");
	}
	
	@GetMapping("new/user")
	public String returnNewUser() {
		System.out.println("New call");
		return "Hi";
	}
	
}
