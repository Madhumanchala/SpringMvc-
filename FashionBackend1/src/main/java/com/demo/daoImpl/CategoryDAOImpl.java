package com.demo.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDAO;
import com.demo.model.Categorys;

@Repository
@Transactional
@Service
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Boolean addCategory(Categorys category) {
		sessionFactory.getCurrentSession().save(category);
		return true;
	}

	public boolean deleteCategory(Categorys category) {

		sessionFactory.getCurrentSession().delete(category);

		return true;
	}

	public boolean updateCategory(Categorys category) {
		System.out.println(category.getCategoryId());
		sessionFactory.getCurrentSession().update(category);

		return true;
	}
	
	
	public List<Categorys> listCategories() { 
		@SuppressWarnings("unchecked")
		List<Categorys> listCategories = sessionFactory.getCurrentSession().createQuery("from Categorys").list();
		return listCategories;
	}

//	public List<Categorys> listCategories() {
//
//		Session session = sessionFactory.openSession();
//		Query query =(Query) session.createQuery("from Categorys").list();
//		List<Categorys> listCategories = query.list();
//
//		session.close();
//		return listCategories;
//	}

	public Categorys getCategory(int categoryId) {

		Session session = sessionFactory.openSession();

		Categorys category = session.get(Categorys.class, categoryId);

		return category;
	}

}
