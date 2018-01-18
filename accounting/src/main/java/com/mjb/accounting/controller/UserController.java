package com.mjb.accounting.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mjb.accounting.model.User;
import com.mjb.accounting.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public String userManage(Model model) {
		Iterable<User> users= userService.findAll();
		model.addAttribute("users", users);
		return "admin/user_list";
	}
	
	@PostMapping("/save")
	public String saveUserInfo(@Valid User user, Errors errors) {
		if (errors.hasErrors()) {
		      return "admin/user_list";
		}
		userService.save(user);
		return "redirect:/user/all";
	}
	
}
