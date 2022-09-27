package com.demo.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDAO;
import com.demo.model.UserDetails;

@Repository
@Transactional
@Service
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean registerUser(UserDetails user) {
		sessionFactory.getCurrentSession().save(user);
		return true;
	}

	public boolean updateUser(UserDetails user) {
		sessionFactory.getCurrentSession().update(user);

		return true; 	
	}

	public UserDetails getUser(String userName) {
		Session session = sessionFactory.openSession();

		UserDetails userDetails = session.get(UserDetails.class, userName);

		return userDetails;
	}

}
