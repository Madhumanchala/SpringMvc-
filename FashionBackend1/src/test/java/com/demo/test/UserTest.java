package com.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.config.Configuration;
import com.demo.dao.SupplierDAO;
import com.demo.dao.UserDAO;
import com.demo.model.Supplier;
import com.demo.model.UserDetails;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=Configuration.class)
public class UserTest {

	
	@Autowired
	private UserDAO userDAO;
	
	@Test
	public void registerUser() {
		UserDetails user = new UserDetails(); 
		
		user.setUserName("Ramu");
		user.setPassword("pass123");
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		user.setCustomerName("Kamal");
		user.setCustomerAddr("Mumbai");
		
		assertTrue("User product Added",userDAO.registerUser(user));
		//assertTrue(true);
	}



}
