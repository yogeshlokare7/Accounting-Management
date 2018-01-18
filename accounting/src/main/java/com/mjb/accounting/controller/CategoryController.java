package com.mjb.accounting.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mjb.accounting.model.CategoryTypeMaster;
import com.mjb.accounting.model.User;
import com.mjb.accounting.service.CategoryTypeService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryTypeService categoryTypeService;
	
	@GetMapping("/types")
	public String categoryTypes(Model model) {
		Iterable<CategoryTypeMaster> categoryTypeMaster =categoryTypeService.getCategoryTypes();
		model.addAttribute("categoryTypes", categoryTypeMaster);
		System.out.println(categoryTypeMaster.toString());
		return "category/category_type";
	}
	
	@GetMapping("/all")
	public String categories() {
		return "category/category_list";
	}
	
	@PostMapping("/type/save")
	public String saveCategoryType(@Valid CategoryTypeMaster categoryTypeMaster, Errors errors) {
		if (errors.hasErrors()) {
		      return "admin/user_list";
		}
		categoryTypeService.saveCategoryType(categoryTypeMaster);
		return "redirect:/category/types";
	}

}
