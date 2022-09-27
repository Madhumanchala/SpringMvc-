package ecommerce.dao;

import java.util.List;

import eCommerce.model.Category;

public interface CategoryDAO {
	
	public Categorys addCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	
	public List<Category> listCategories();
	
	public Category getCategory(int categoryId);
	
	

}
