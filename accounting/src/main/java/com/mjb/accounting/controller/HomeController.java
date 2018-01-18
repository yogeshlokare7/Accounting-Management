package com.mjb.accounting.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mjb.accounting.model.User;
import com.mjb.accounting.service.UserService;

@Controller            // <1>
public class HomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")    
	public String signIn() {
		return "sign_in";     
	}
	
	@GetMapping("/home")    
	public String home() {
		return "home/home";     
	}
	
	@GetMapping("/demo_example")    
	public String templatePage() {
		return "demo/demo_example";     
	}
	
	@GetMapping("/demo")    
	public String demo() {
		return "home/demo";     
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.findAll();
	}
	

	@PostMapping("/login")
	public String signIn(@Valid User user, Errors errors) {
		if (errors.hasErrors()) {
			return "sign_in";
		}
		return "redirect:/home";
	}
}
