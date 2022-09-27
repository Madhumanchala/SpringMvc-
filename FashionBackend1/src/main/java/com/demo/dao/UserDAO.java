package com.demo.dao;

import com.demo.model.Product;
import com.demo.model.UserDetails;

public interface UserDAO {
	
	public boolean registerUser(UserDetails user);
	public boolean updateUser(UserDetails user);
	
	public UserDetails getUser(String userName);

}
