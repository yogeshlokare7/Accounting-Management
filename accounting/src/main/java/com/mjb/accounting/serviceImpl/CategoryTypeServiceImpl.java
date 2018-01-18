package com.mjb.accounting.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjb.accounting.model.CategoryTypeMaster;
import com.mjb.accounting.repository.CategoryTypeRepository;
import com.mjb.accounting.service.CategoryTypeService;

@Service
public class CategoryTypeServiceImpl implements CategoryTypeService{
	
	@Autowired
	private CategoryTypeRepository categoryTypeRepository;

	@Override
	public void saveCategoryType(CategoryTypeMaster categoryTypeMaster) {
		categoryTypeRepository.save(categoryTypeMaster);
	}

	@Override
	public Iterable<CategoryTypeMaster> getCategoryTypes() {
		return categoryTypeRepository.findAll();
	}
	
	

}
