package com.logiclabs.logicsprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logiclabs.logicsprint.model.User;
import com.logiclabs.logicsprint.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		userService.saveUser(user);
		return "adicionado com sucesso!";
	}
}
