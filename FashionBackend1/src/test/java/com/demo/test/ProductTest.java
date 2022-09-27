package com.demo.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.config.Configuration;
import com.demo.dao.ProductDAO;
import com.demo.model.Product;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=Configuration.class)
public class ProductTest {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	@Test
	public void addProduct() {
		Product product = new Product(); 
		
		product.setProductName("T-Shirt");
		product.setProductDesc("United colors ");
		product.setPrice(800);
		product.setStock(45);
		product.setCategoryId(18);
		product.setSupplierId(50);
		
		assertTrue("User product Added",productDAO.addProduct(product));
	}

}
