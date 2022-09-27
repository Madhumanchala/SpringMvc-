package com.demo.dao;

import java.util.List;

import com.demo.model.Categorys;
import com.demo.model.Product;

public interface ProductDAO {
	
	public Boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	
	public List<Product> listProducts();
	
	public  Product getProduct(int productId);
	

}
