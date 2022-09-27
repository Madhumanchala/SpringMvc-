package com.demo.dao;

import java.util.List;

import com.demo.model.Categorys; 

public interface CategoryDAO {

	public Boolean addCategory(Categorys category);
	public boolean deleteCategory(Categorys category);
	public boolean updateCategory(Categorys category);
	
	public List<Categorys> listCategories();
	
	public Categorys getCategory(int categoryId);
	
}
