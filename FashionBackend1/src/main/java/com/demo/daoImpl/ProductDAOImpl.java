package com.demo.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDAO;
import com.demo.model.Categorys;
import com.demo.model.Product;

@Repository
@Transactional
@Service
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Boolean addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
		return true;
	}

	public boolean deleteProduct(Product product) {

		sessionFactory.getCurrentSession().delete(product);

		return true;
	}

	public boolean updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);

		return true;
	}

	public List<Product> listProducts() {
		Session session = sessionFactory.openSession();
		Query query = (Query) session.createQuery("from Product");
		List<Product> listProducts = query.list();

		session.close();
		return listProducts;
	}

	public Product getProduct(int productId) {
		Session session = sessionFactory.openSession();

		Product product = session.get(Product.class, productId);

		return product;
	}

}
