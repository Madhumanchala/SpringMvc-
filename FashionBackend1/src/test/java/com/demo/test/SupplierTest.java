package com.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.config.Configuration;
import com.demo.dao.SupplierDAO;
import com.demo.model.Supplier;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=Configuration.class)
public class SupplierTest {
	
	@Autowired
	private SupplierDAO supplierDAO;
	

	@Test
	public void addSupplier() {
		Supplier supplier = new Supplier(); 
		
		supplier.setSupplierName("Damodar");
		supplier.setSupplierAddress("Dehli");
		
		assertTrue("User product Added",supplierDAO.addSupplier(supplier));
	}


}
