package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	@GetMapping
	public String getUser() {
		return "get user controller was called";
	}
	
	@PostMapping
	public String createUser() {
		return "create user was called";
	}
	
	@PutMapping
	public String updateUser() {
		return "update was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete was called";
	}
	
}
