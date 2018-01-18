package com.mjb.accounting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tax-info")
public class TaxInfoController {
	
	@GetMapping("/all")
	public String taxinfolist() {
		return "master/taxinfo_list";
	}

}
