package com.reactspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactspringboot.model.User;
import com.reactspringboot.repo.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
	
	//Sample controller
	
	@GetMapping("test")
	public String testApi() {
		return "This is just a test!!!!!";
	}
	
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepo.findAll();
	}
}
