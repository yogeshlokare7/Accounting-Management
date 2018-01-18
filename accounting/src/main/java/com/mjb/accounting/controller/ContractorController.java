package com.mjb.accounting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contractor")
public class ContractorController {

	@GetMapping("/all")
	public String contractors() {
		return "master/contractor_list";
	}
}
