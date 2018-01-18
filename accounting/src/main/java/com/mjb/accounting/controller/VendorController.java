package com.mjb.accounting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendor")
public class VendorController {

	@GetMapping("/all")
	public String vendors() {
		return "master/vendor_list";
	}
}
