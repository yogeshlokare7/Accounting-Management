package com.mjb.accounting.service;

import com.mjb.accounting.model.CategoryTypeMaster;

public interface CategoryTypeService {

	public void saveCategoryType(CategoryTypeMaster categoryTypeMaster);
	public Iterable<CategoryTypeMaster> getCategoryTypes();
}
