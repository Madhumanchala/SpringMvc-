package com.demo.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.config.Configuration;
import com.demo.dao.CategoryDAO;
import com.demo.dao.ProductDAO;
import com.demo.model.Categorys;
import com.demo.model.Product; 

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=Configuration.class)
public class TestProject {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	

	@Test
	public void addCategory() {
		Categorys category = new Categorys(); 
		category.setCategoryName("T Shirt ");
		category.setCategoryDesc("All Varieties of T Shirt"); 
		
		assertTrue("User Added",categoryDAO.addCategory(category));
	}
	
	

}
